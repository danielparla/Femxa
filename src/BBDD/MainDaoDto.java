package BBDD;

import java.util.Scanner;

public class MainDaoDto {

	public static void main(String[] args) throws Exception {
		
		try{
		
		Scanner sc=new Scanner(System.in);	//pido un numero de departamento
		int dpto_leido=sc.nextInt();
		
		for (EmpleadosDto emp: Dao.empleado(dpto_leido)){	//enviamos el nº al DAO, el DAO crao objetos DTO y los almacena en una lista
			System.out.println(emp.empleado_id+" "+emp.nombre);	//Dao.empleado() devuelve esa lista, solo hay que recorrerla
		}
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
