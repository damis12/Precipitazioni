package progetto_precipitazioni;

import java.util.ArrayList;

/**
 * Implemento la classe Precipitazioni
 *
 * @author Giuseppe Damis
 */

public class Precipitazioni {
	
	private int[][] cartaPrecipitazioni;
	private ArrayList<Visualizzatore> visualizzatori = new ArrayList<Visualizzatore>(10);
	
	//Costruttore della classe Precipitazioni
	public Precipitazioni() {
		this.cartaPrecipitazioni = new int[20][20];
	}
	
	public int[][] getCartaPrecipitazioni() {
		return this.cartaPrecipitazioni;
	}
	
	public void aggiungiVisualizzatore(Visualizzatore v) {
		this.visualizzatori.add(v);
		v.setPrecipitazioni(this);
	}
	
	public void notificaAggiornamento(int tempo) {
		for (Visualizzatore v : visualizzatori) {
			v.aggiornaSchermata(tempo);
		}
	}

	private void calcolaPrecipitazioni(int istanteTemporale){
		for (int i=0; i<this.cartaPrecipitazioni.length; i++)
			for (int j=0; j<this.cartaPrecipitazioni[i].length; j++)
				this.cartaPrecipitazioni[i][j] = (int)(Math.random()*10);
		try { Thread.sleep( 100); }
		catch( InterruptedException e ) {
			e.printStackTrace();
		}
	}
	
	public void eseguiSimulazione() {
		for (int tempo=0; tempo<100; tempo++) {
			this.calcolaPrecipitazioni(tempo);
			this.notificaAggiornamento(tempo);
		}
	}

}//class Precipitazioni
