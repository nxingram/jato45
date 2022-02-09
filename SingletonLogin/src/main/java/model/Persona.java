package model;

public class Persona {
// DAO = data access object
	String nome;
	String cognome;
	String email;
	String password;
	boolean logged;	
	
	public Persona(String nome, String cognome, String email, String password) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.setLogged(false);
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public boolean isLogged() {
		return logged;
	}



	public void setLogged(boolean logged) {
		this.logged = logged;
	}



	@Override
	public String toString() {
		return "PersonaDAO [nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", logged=" + logged
				+ "]";
	}
	
	
}
