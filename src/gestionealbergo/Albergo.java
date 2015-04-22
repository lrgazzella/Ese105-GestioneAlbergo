package gestionealbergo;

import java.util.Vector;

public class Albergo {
	
	private Vector<Camera> camere;

	
	public Vector<Camera> getCamere() {
		return camere;
	}
	public void setCamere(Vector<Camera> camere) { //Chiedere se va messo l'indice
		this.camere = camere;
	}
	
}
