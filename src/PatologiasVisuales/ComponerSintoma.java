package PatologiasVisuales;

import java.util.List;

public class ComponerSintoma {

	SintomasDTO componerSintoma(SintomasDTO sintoma, List<PatologiaDTO> listaPatologias){
		
		sintoma.setLista_patologias(listaPatologias);

		return sintoma;
	}
	
	
	
}
