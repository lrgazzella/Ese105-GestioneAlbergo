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
	
	public Vector<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}
	public void setPrenotazioni(Vector<Prenotazione> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}
	
	public void addPrenotazione(Prenotazione prenotazione) throws Exception{
		int anno = prenotazione.getArrivoIl().getYear();
		int mese = prenotazione.getArrivoIl().getMonthValue();
		int giorno = prenotazione.getArrivoIl().getDayOfMonth();
		LocalDateTime al = LocalDateTime.of(anno, mese, giorno+prenotazione.getNumeroNotti(), 12, 00);
		
		if( this.isDisponibile(prenotazione.getArrivoIl(), al) != false ){
			this.prenotazioni.addElement(prenotazione);
		}else{
			throw new Exception("La camera è occupata");
		}
	}
	
	public boolean isDisponibile(LocalDateTime dal, LocalDateTime al){
		boolean value = false;
		for(Prenotazione q : prenotazioni) {
			int numeroNotti = q.getNumeroNotti();
			LocalDateTime arrivo = q.getArrivoIl();

			int anno = arrivo.getYear();
			int mese = arrivo.getMonthValue();
			int giorno = arrivo.getDayOfMonth();	
			
			LocalDateTime partenza = LocalDateTime.of(anno, mese, giorno+numeroNotti, 12, 00); //da migliorare(giorno+numeroNotti)
			
			
			if( (partenza.isBefore(dal)!= false) && (arrivo.isAfter(al) != false) ){
				value = true;
			}else{
				value = false;
			}
				
		}
		
		return value;
	}

	@Override
	public String toString() {
		return "Camera [numero=" + numero + ", prenotazioni=" + prenotazioni
				+ "]";
	}

	

	
	
}