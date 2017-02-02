package PatologiasVisuales;

import java.util.List;

public class ComponerPatologia {

	PatologiaDTO componerPatologia(PatologiaDTO patologia, List<SintomasDTO> lista_sintomas){
		
	
		patologia.setLista_sintomas(lista_sintomas);
		
		return patologia;
	}
}
