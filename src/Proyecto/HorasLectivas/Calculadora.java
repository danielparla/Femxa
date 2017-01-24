package Proyecto.HorasLectivas;

public class Calculadora {

	public static float porFaltas(float horas_totales, float tiempo_no_asistido){
		
		float porc_faltas;
		
		porc_faltas=(tiempo_no_asistido/horas_totales*100);
		
		
		return porc_faltas;
	}
}
