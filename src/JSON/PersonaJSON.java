package JSON;

import com.google.gson.Gson;

public class PersonaJSON {

	public static void main(String[] args) {
		
		Gson gson= new Gson();
		
		Persona p = new Persona("Mikel", false, false, 4);
	
		String jsonPersona = gson.toJson(p);
		
		System.out.println(jsonPersona);
		
		Persona p2= gson.fromJson(jsonPersona, Persona.class);
		
		System.out.println(p2.getNombre()+" tiene "+p2.getnHijos()+" hijos.");
	}

}
