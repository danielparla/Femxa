package Femxa.clase;

public class InstruccionesSQL {

	public static final String CONSULTA_EMPLEADOS_SALARIO 
	= "SELECT E.FIRST_NAME, E.EMPLOYEE_ID, E.SALARY, "
	+ "E.DEPARTMENT_ID, D.DEPARTMENT_NAME, D.DEPARTMENT_ID "
	+ "FROM DEPARTMENTS D, EMPLOYEES E WHERE E.DEPARTMENT_ID"
	+ " = D.DEPARTMENT_ID AND D.DEPARTMENT_ID=10";

	public static final String CONSULTA_EMPLEADOS_SALARIO_POST_UPDATE
	= "SELECT NOMBRE_EMPLEADO, FECHA, OLD_SALARY, "
	+ "NEW_SALARY FROM AUMENTOS_SALARIO";

	public static final String ACTUALIZAR_EMPLEADOS_SALARIO
	= "UPDATE EMPLOYEES SET SALARY = SALARY*1.2 where "
	+ "EMPLOYEES.DEPARTMENT_ID=10";

}
