package BBDD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Dao{

	public static List<EmpleadosDto> empleado(int id)throws Exception {
		
		String consulta="SELECT * FROM EMPLOYEES WHERE EMPLOYEES.DEPARTMENT_ID="+id;
		
		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		
		List<EmpleadosDto> lista_empleados;

		lista_empleados = new ArrayList<EmpleadosDto>();
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "HR", "password");
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			rset = stmt.executeQuery(consulta);
			
			String nombre = null;
			int ID =0;
			
			int dpto = 0;
			
			EmpleadosDto empleado = new EmpleadosDto(nombre,ID,dpto);
			lista_empleados.add(empleado);
			
			while (rset.next()){
				nombre = rset.getString("FIRST_NAME");
				ID = rset.getInt("EMPLOYEE_ID");
				dpto = rset.getInt("DEPARTMENT_ID");
				
				
				empleado = new EmpleadosDto(nombre, ID, dpto);
				lista_empleados.add(empleado);
				conn.commit();
				
			}
			

		} catch (Throwable e) {
			e.printStackTrace();
			throw e;
			
		} 
		finally 
		{
			if (rset != null) {
				try {
					rset.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		}
		return lista_empleados;
	}
}