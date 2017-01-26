package RegistroPrograma;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import BBDD.Empleado;

public class yo {

	public static void mostrarLista(ArrayList<Empleado> lemp) {

		for (Empleado emp : lemp) {
			System.out.println("El empleado " +emp.getNombre() + " pertenece al departamento de " + emp.getNom_dpto());

		}
	}

	public static <dpto> void main(String[] args) throws Exception {

		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;

		ArrayList<Empleado> lista_empleados;

		lista_empleados = new ArrayList<Empleado>();

		Empleado empleado = new Empleado(2, "Juanjo", 27000, 5, "LOCO");

		try {
			// registro el driver, en realidad, hago que se ejecuten unas pocas
			// líneas de la clase OracleDriver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// DriverManager.registerDriver (new
			// oracle.jdbc.driver.OracleDriver());// método equivalente al
			// anterior
			// Sea como sea, es, <<oye, si te piden una conexión, se la pides a
			// esa clase!>>
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
			stmt = conn.createStatement();
			rset = stmt
					.executeQuery("SELECT E.FIRST_NAME, E.EMPLOYEE_ID, E.SALARY, E.DEPARTMENT_ID, D.DEPARTMENT_NAME FROM EMPLOYEES E, DEPARTMENTS D where E.DEPARTMENT_ID = D.DEPARTMENT_ID ORDER BY SALARY DESC");

			while (rset.next()) {
				String nombre = rset.getString("FIRST_NAME");
				int ID = rset.getInt("EMPLOYEE_ID");
				int salario = rset.getInt("SALARY");
				int dpto = rset.getInt("DEPARTMENT_ID");
				String nom_dpto = rset.getString("DEPARTMENT_NAME");
				empleado = new Empleado(ID, nombre, salario, dpto, nom_dpto);
				lista_empleados.add(empleado);
			}

			mostrarLista(lista_empleados);

		} catch (Exception e) {
			e.printStackTrace();
		} finally // libero recursos, de "adentro a fuera" , ResultSet,
					// Statment, Conexion
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
