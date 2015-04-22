package gestionealbergo;


public class Cliente {
	
	private String nome;
	private String cognome;
	private String email;
	private String cellulare;
	
	
	public Cliente(String nome, String cognome, String email, String cellulare) throws Exception{
		
		if( nome.length() <= 0 ){
			throw new Exception("Il nome deve essere maggiore di 0 caratteri");
		}
		this.nome = nome;
		
		if( cognome.length() <= 0 ){
			throw new Exception("Il cognome deve essere maggiore di 0 caratteri");
		}
		this.cognome = cognome;
		
		if( email.length() <= 0 ){
			throw new Exception("L'email deve essere maggiore di 0 caratteri");
		}
		this.email = email;
		
		if( cellulare.length() <= 0 ){
			throw new Exception("Il cellulare deve essere maggiore di 0 caratteri");
		}
		this.cellulare = cellulare;
		
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		if( nome.length() <= 0 ){
			throw new Exception("Il nome deve essere maggiore di 0 caratteri");
		}
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) throws Exception {
		if( cognome.length() <= 0 ){
			throw new Exception("Il cognome deve essere maggiore di 0 caratteri");
		}
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws Exception {
		if( email.length() <= 0 ){
			throw new Exception("L'email deve essere maggiore di 0 caratteri");
		}
		this.email = email;
	}

	public String getCellulare() {
		return cellulare;
	}

	public void setCellulare(String cellulare) throws Exception {
		if( cellulare.length() <= 0 ){
			throw new Exception("Il cellulare deve essere maggiore di 0 caratteri");
		}
		this.cellulare = cellulare;
	}

	

}
