package Femxa.clase;

public class Empleado {

	private int id;
	private String nombre;
	private int salario;
	private int dpto;
	private String nom_dpto;

	public Empleado(int id, String nombre, int salario, int dpto, String nom_dpto) {
		
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
		this.dpto = dpto;
		this.nom_dpto= nom_dpto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getDpto() {
		return dpto;
	}

	public void setDpto(int dpto) {
		this.dpto = dpto;
	}

	public String getNom_dpto() {
		return nom_dpto;
	}

	public void setNom_dpto(String nom_dpto) {
		this.nom_dpto = nom_dpto;
	}

	
}
