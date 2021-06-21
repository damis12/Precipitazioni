package progetto_precipitazioni;


/**
 * Implemento la classe VisualizzatoreMatrice
 *
 * @author Giuseppe Damis
 */

public class VisualizzatoreMatrice implements Visualizzatore {

	private Precipitazioni precipitazioni;

	public Precipitazioni getPrecipitazioni() {
		return precipitazioni;
	}
	
	@Override
	public void setPrecipitazioni(Precipitazioni p) {
		this.precipitazioni = p;
		
	}

	public void aggiornaSchermata(int passo) {
		System.out.println("Passo " + passo);
		for (int i=0; i<precipitazioni.getCartaPrecipitazioni().length; i++) {
			for (int j=0; j<precipitazioni.getCartaPrecipitazioni()[i].length; j++)
				System.out.print(precipitazioni.getCartaPrecipitazioni()[i][j]+" ");
			System.out.println();
		}
	}

}//class VisualizzatoreMatrice
