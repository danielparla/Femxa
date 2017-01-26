package BBDD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class AumentarSueldo {
	
	public static void mostrarLista(ArrayList<Empleado> lemp) {

		for (Empleado emp : lemp) {
			System.out.println("El empleado " +emp.getNombre() + " pertenece al departamento de " +emp.getDpto()+" pasará a cobrar "+ (emp.getSalario()*1.2));

		}
	}

	public static <dpto> void main(String[] args) throws Exception {

		String consulta1=InstruccionesSQL.CONSULTA_EMPLEADOS_SALARIO;
		String update= InstruccionesSQL.ACTUALIZAR_EMPLEADOS_SALARIO;
		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		boolean rset_update=false;
		
		ArrayList<Empleado> lista_empleados;

		lista_empleados = new ArrayList<Empleado>();
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "HR", "password");
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			rset = stmt.executeQuery(consulta1);
			
			String nombre = null;
			int ID =0;
			int salario = 0;
			int dpto = 0;
			String nom_dpto = null;
			Empleado empleado = new Empleado(ID, nombre, salario, dpto, nom_dpto);
			lista_empleados.add(empleado);
			
			while (rset.next()){
				nombre = rset.getString("FIRST_NAME");
				ID = rset.getInt("EMPLOYEE_ID");
				dpto = rset.getInt("DEPARTMENT_ID");
				nom_dpto = rset.getString("DEPARTMENT_NAME");
				salario = rset.getInt("SALARY");
				empleado = new Empleado(ID, nombre, salario, dpto, nom_dpto);
				lista_empleados.add(empleado);
				conn.commit();
				rset_update=stmt.execute(update);
			}
			
			mostrarLista(lista_empleados);

		} catch (Exception e) {
			e.printStackTrace();
			conn.rollback();
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
	}
}