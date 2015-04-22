package ese105;

import java.time.LocalDateTime;

import gestionealbergo.*;

public class Ese105 {

	public static void main(String[] args) throws Exception {
		
		Cliente lorenzo = new Cliente("Lorenzo", "Gazzella", "<indirizzo>@gmail.com", "0123456789");
		Singola cameraSingola = new Singola("18");
		
		LocalDateTime arrivoIl = LocalDateTime.of(2015, 8, 15, 13, 00);
		LocalDateTime effettuataIl = LocalDateTime.of(2015, 4, 22, 22, 24);
		LocalDateTime clienteArrivaIl = LocalDateTime.of(2015, 8, 15, 13, 00);
		String richieste = "TV 50''";
		int numeroNotti = 4;
		Prenotazione prenotazione = new Prenotazione(arrivoIl, effettuataIl, clienteArrivaIl, richieste, numeroNotti);
		prenotazione.setCliente(lorenzo);
		prenotazione.setCamera(cameraSingola);
		cameraSingola.addPrenotazione(prenotazione);
		
		Albergo albergo = new Albergo();
		
		
	}

}
