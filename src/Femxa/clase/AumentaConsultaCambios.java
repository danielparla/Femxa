package Femxa.clase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.ArrayList;

public class AumentaConsultaCambios {

	public static void mostrarLista(ArrayList<Sueldos> lemp) {

		for (Sueldos emp : lemp) {
			System.out.println("El empleado " + emp.getNombre()
					+ " que cobraba " + emp.getSueldo_antiguo()
					+ " pasará a cobrar " + emp.getSueldo_nuevo() + " desde "
					+ emp.getFecha());

		}
	}

	public static <dpto> void main(String[] args) throws Exception {

		String consulta2 = InstruccionesSQL.CONSULTA_EMPLEADOS_SALARIO_POST_UPDATE;
		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		Savepoint sv = null;
		ArrayList<Sueldos> lista_empleados;

		lista_empleados = new ArrayList<Sueldos>();

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:xe", "HR", "password");
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			rset = stmt.executeQuery(consulta2);
			
			sv=conn.setSavepoint();                  //SAVEPOINT CONECTION
			 
			String nombre = null;
			int salario1 = 0;
			int salario2 = 0;
			String fecha = null;
			Sueldos sueldo = new Sueldos(nombre, salario1, salario2, fecha);
			lista_empleados.add(sueldo);

			while (rset.next()) {
				nombre = rset.getString("NOMBRE_EMPLEADO");
				salario1 = rset.getInt("NEW_SALARY");
				salario2 = rset.getInt("OLD_SALARY");
				fecha = rset.getString("FECHA");
				sueldo = new Sueldos(nombre, salario1, salario2, fecha);
				lista_empleados.add(sueldo);
				conn.commit();
			}

			mostrarLista(lista_empleados);

		} catch (Exception e) {
			e.printStackTrace();
			conn.rollback();               //ANULA ToDO HASTA EL SAVEPOINT
		} finally {
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
