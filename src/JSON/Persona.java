package JSON;

public class Persona {

	private String nombre;
	private boolean casada;
	private boolean parada;
	private int nHijos;
	
	public Persona(String nombre, boolean casada, boolean parada, int nHijos) {
		
		this.nombre = nombre;
		this.casada = casada;
		this.parada = parada;
		this.nHijos = nHijos;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isCasada() {
		return casada;
	}
	public void setCasada(boolean casada) {
		this.casada = casada;
	}
	public boolean isParada() {
		return parada;
	}
	public void setParada(boolean parada) {
		this.parada = parada;
	}
	public int getnHijos() {
		return nHijos;
	}
	public void setnHijos(int nHijos) {
		this.nHijos = nHijos;
	}
	
}
