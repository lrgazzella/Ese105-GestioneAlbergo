package gestionealbergo;

import java.time.LocalDateTime;
import java.util.Vector;

abstract public class  Camera {
	
	private String numero;
	private Vector<Prenotazione> prenotazioni;	
	
	public Camera(String numero) {
		this.numero = numero;
		prenotazioni = new Vector<Prenotazione>(1,1);
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void addPrenotazione(Prenotazione prenotazione){
		this.prenotazioni.addElement(prenotazione);
	}
	
	public boolean isDisponibile(LocalDateTime dal, LocalDateTime al){
		
	}
	
	
}
