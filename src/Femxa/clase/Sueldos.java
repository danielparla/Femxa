package Femxa.clase;

public class Sueldos {

	private String nombre;
	private int sueldo_nuevo;
	private int sueldo_antiguo;
	private String fecha;
	
	public Sueldos(String nombre, int sueldo_nuevo, int sueldo_antiguo,
			String fecha) {
		
		this.nombre = nombre;
		this.sueldo_nuevo = sueldo_nuevo;
		this.sueldo_antiguo = sueldo_antiguo;
		this.fecha = fecha;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSueldo_nuevo() {
		return sueldo_nuevo;
	}
	public void setSueldo_nuevo(int sueldo_nuevo) {
		this.sueldo_nuevo = sueldo_nuevo;
	}
	public int getSueldo_antiguo() {
		return sueldo_antiguo;
	}
	public void setSueldo_antiguo(int sueldo_antiguo) {
		this.sueldo_antiguo = sueldo_antiguo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
}
