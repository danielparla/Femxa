package Proyecto.HorasLectivas;
import java.util.Scanner;

public class InTime {

	static float numLeido(){
	
		Scanner sc=new Scanner(System.in);
		float numero=sc.nextFloat();
		
		return numero;
	}
	
	public static void main(String[] args) {

		System.out.println(
				"Hola. \n �ste es un asistente para calcular"
				+ " su porcentaje de asistencia en un curso."
				+ " \n �Conoce el n�mero de horas totales del curso?"
				+ "\n1: Si.\n2: No.");
		
		float horas_totales=0;
		float horas_diarias=0;
		float dias_totales=0;
		float tiempo_no_asistido=0;
		
		if (numLeido()==1) {
		
			System.out.println("�Cu�ntas horas totales tiene su curso?");
			horas_totales=numLeido();
			System.out.println("�Cu�ntos horas completas diarias tiene su curso?");
			horas_diarias=numLeido();
			
			
			System.out.println("�Cuantos dias ha faltado?...Marque 0 si no ha faltado ning�n d�a...");
			tiempo_no_asistido= (numLeido()*horas_diarias);
				
			float por_faltas= Calculadora.porFaltas(horas_totales, tiempo_no_asistido);
			
			System.out.println("Su porcentaje de faltas es del "+por_faltas+ "%");
		}
		
		else{
			System.out.println("�Cu�ntas horas completas de clase hay en cada d�a?");
			horas_diarias=numLeido();
			
			System.out.println("Cu�ntos dias de clase totales hay en su curso?");
			dias_totales=numLeido();
			
			horas_totales=(dias_totales*horas_diarias);
			
			System.out.println("�Cuantos dias ha faltado?...Marque 0 si no ha faltado ning�n d�a...");
			tiempo_no_asistido= (numLeido()*horas_diarias);
				
			float por_faltas= Calculadora.porFaltas(horas_totales, tiempo_no_asistido);
			
			System.out.println("Su porcentaje de faltas es del "+por_faltas+ "%");
		}
			
		
				
		
	}

}
