package Femxa.clase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class AumentarSueldo {
	
	public static void mostrarLista(ArrayList<Empleado> lemp) {

		for (Empleado emp : lemp) {
			System.out.println("El empleado " +emp.getNombre() + " pertenece al departamento de " +emp.getDpto()+" pasará de cobrar "+ (emp.getSalario()*1.2));

		}
	}

	public static <dpto> void main(String[] args) throws Exception {

		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		
		ArrayList<Empleado> lista_empleados;

		lista_empleados = new ArrayList<Empleado>();
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
			stmt = conn.createStatement();
			rset = stmt.executeQuery("SELECT E.FIRST_NAME, E.EMPLOYEE_ID, E.SALARY, E.DEPARTMENT_ID, D.DEPARTMENT_NAME, D.DEPARTMENT_ID FROM DEPARTMENTS D, EMPLOYEES E WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID AND D.DEPARTMENT_ID=10");
			String nombre = null;
			int ID =0;
			int salario = 0;
			int dpto = 0;
			String nom_dpto = null;
			Empleado empleado = new Empleado(ID, nombre, salario, dpto, nom_dpto);
			lista_empleados.add(empleado);
			ResultSet rset2=null;
			
			while (rset.next()) {
				nombre = rset.getString("FIRST_NAME");
				ID = rset.getInt("EMPLOYEE_ID");
				
				dpto = rset.getInt("DEPARTMENT_ID");
				nom_dpto = rset.getString("DEPARTMENT_NAME");
				salario = rset.getInt("SALARY");
				empleado = new Empleado(ID, nombre, salario, dpto, nom_dpto);
				rset2= stmt.executeQuery("UPDATE EMPLOYEES SET SALARY = SALARY*1.2 where EMPLOYEES.DEPARTMENT_ID=10");
				conn.commit();
				lista_empleados.add(empleado);
			}
			
			mostrarLista(lista_empleados);

		} catch (Exception e) {
			e.printStackTrace();
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