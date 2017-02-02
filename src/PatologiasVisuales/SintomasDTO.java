package PatologiasVisuales;

import java.util.List;

public class SintomasDTO {

	private int id_sintoma;
	private String nombre_sintoma;
	private List<PatologiaDTO> lista_patologias;
	
	public SintomasDTO(int id_sintoma, String nombre_sintoma, List<PatologiaDTO> lista_patologias) {


		this.id_sintoma = id_sintoma;
		this.nombre_sintoma = nombre_sintoma;
		this.lista_patologias= lista_patologias;
		
	}
	
	public int getId_sintoma() {
		return id_sintoma;
	}
	public List<PatologiaDTO> getLista_patologias() {
		return lista_patologias;
	}

	public void setLista_patologias(List<PatologiaDTO> lista_patologias) {
		this.lista_patologias = lista_patologias;
	}

	public void setId_sintoma(int id_sintoma) {
		this.id_sintoma = id_sintoma;
	}
	public String getNombre_sintoma() {
		return nombre_sintoma;
	}
	public void setNombre_sintoma(String nombre_sintoma) {
		this.nombre_sintoma = nombre_sintoma;
	}
	
	
}
