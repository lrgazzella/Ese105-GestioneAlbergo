package gestionealbergo;

import java.time.LocalDateTime;

public class Prenotazione {
	
	private LocalDateTime arrivoIl;
	private LocalDateTime effettuataIl;
	private LocalDateTime clienteArrivaIl;
	private String richieste;
	private int numeroNotti;
	private Camera camera;
	private Cliente cliente;
	
	public Prenotazione(LocalDateTime arrivoIl, LocalDateTime effettuataIl,LocalDateTime clienteArrivaIl, String richieste, int numeroNotti) throws Exception {
		this.arrivoIl = arrivoIl;
		this.effettuataIl = effettuataIl;
		this.clienteArrivaIl = clienteArrivaIl;
		this.richieste = richieste;
		if( numeroNotti <= 0){
			throw new Exception("Il numero di notti devono essere maggiori di 0");
		}
		this.numeroNotti = numeroNotti;
	}


	
	public LocalDateTime getArrivoIl() {
		return arrivoIl;
	}


	public void setArrivoIl(LocalDateTime arrivoIl) {
		this.arrivoIl = arrivoIl;
	}


	public LocalDateTime getEffettuataIl() {
		return effettuataIl;
	}


	public void setEffettuataIl(LocalDateTime effettuataIl) {
		this.effettuataIl = effettuataIl;
	}


	public LocalDateTime getClienteArrivaIl() {
		return clienteArrivaIl;
	}


	public void setClienteArrivaIl(LocalDateTime clienteArrivaIl) {
		this.clienteArrivaIl = clienteArrivaIl;
	}


	public String getRichieste() {
		return richieste;
	}


	public void setRichieste(String richieste) {
		this.richieste = richieste;
	}


	public int getNumeroNotti() {
		return numeroNotti;
	}


	public void setNumeroNotti(int numeroNotti) throws Exception{
		if( numeroNotti <= 0 ){
			throw new Exception("Il numero delle notti deve essere maggiore di 0");
		}
		this.numeroNotti = numeroNotti;
	}
	
	
	
	
	
	
}
