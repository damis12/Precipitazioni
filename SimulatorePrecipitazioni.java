package progetto_precipitazioni;

/**
 * Implemento la classe SimulatorePrecipitazioni - main inside
 *
 * @author Giuseppe Damis
 */


public class SimulatorePrecipitazioni {

	public static void main (String[] args){
		
		Precipitazioni p = new Precipitazioni();
		VisualizzatoreMatrice vm = new VisualizzatoreMatrice();

		p.aggiungiVisualizzatore(vm);
		p.eseguiSimulazione();
	
	}//main
	
}//class SimulatorePrecipitazioni