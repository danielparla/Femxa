package BBDD;

public class EmpleadosDto {
	
	
	
	public EmpleadosDto(String nombre, int empleado_id, int dpto_id) {
		
		this.nombre = nombre;
		this.empleado_id = empleado_id;
		this.dpto_id = dpto_id;
	}
	
	String nombre;
	int empleado_id;
	int dpto_id;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEmpleado_id() {
		return empleado_id;
	}
	public void setEmpleado_id(int empleado_id) {
		this.empleado_id = empleado_id;
	}
	public int getDpto_id() {
		return dpto_id;
	}
	public void setDpto_id(int dpto_id) {
		this.dpto_id = dpto_id;
	}
	
	
}

