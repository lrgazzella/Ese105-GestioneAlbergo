package ese105;

import java.time.LocalDateTime;

import gestionealbergo.*;

public class Ese105 {

	public static void main(String[] args) throws Exception {
		
		Cliente lorenzo = new Cliente("Lorenzo", "Gazzella", "<indirizzo>@gmail.com", "0123456789");
		Cliente filippo = new Cliente("Filippo", "Mantovani", "<indirizzo>@gmail.com", "0123456789");
		
		Singola cameraLorenzo = new Singola("18");
		Singola cameraFilippo = new Singola("18");
		
		LocalDateTime arrivoIl = LocalDateTime.of(2015, 8, 15, 13, 00);
		LocalDateTime effettuataIl = LocalDateTime.of(2015, 4, 22, 22, 24);
		LocalDateTime clienteArrivaIl = LocalDateTime.of(2015, 8, 15, 13, 00);
		
		Prenotazione prenotazioneLorenzo = new Prenotazione(arrivoIl, effettuataIl, clienteArrivaIl, "Nulla", 8);
		
		arrivoIl = LocalDateTime.of(2014, 8, 16, 13, 00);
		effettuataIl = LocalDateTime.of(2015, 4, 22, 22, 24);
		clienteArrivaIl = LocalDateTime.of(2014, 8, 15, 13, 00);
		
		Prenotazione prenotazioneFilippo = new Prenotazione(arrivoIl, effettuataIl, clienteArrivaIl, "Nulla", 6);
		
		prenotazioneLorenzo.setCliente(lorenzo);
		prenotazioneLorenzo.setCamera(cameraLorenzo);
		cameraLorenzo.addPrenotazione(prenotazioneLorenzo);
		
		prenotazioneFilippo.setCliente(filippo);
		prenotazioneFilippo.setCamera(cameraFilippo);
		cameraLorenzo.addPrenotazione(prenotazioneLorenzo);
		
		
		Albergo albergo = new Albergo();
		
		
		for(Camera q : albergo.getCamere()){
			for(Prenotazione a: q.getPrenotazioni()){
				System.out.println(a.toString());
			}
		}
		
		
	}

}
