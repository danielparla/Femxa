
public class Persona {

	String nombre;
	int edad;
	
	public Persona(){
		
		nombre=null;
		edad=0;
		
	}
	
	private String ver_nombre(){
		return nombre;
	}
	
	public void recoger_nombre(String nombre){
		this.nombre=nombre;
	}
	
	public int ver_edad(){
		return edad;
	}
	
	public void ver_persona(){
		System.out.println("Nombre: "+ nombre);
		System.out.println("Edad: "+ edad);
	}
	
}
