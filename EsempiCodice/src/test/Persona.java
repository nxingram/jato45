package test;

import java.util.List;

public class Persona {

	String nome;
	String cognome;
	
	public Persona() {
	}
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
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

	public static void main(String[] args) {

		List<Persona> listP = DbStatic.lista;
		for (Persona person : listP) {
			System.out.println(person.getNome());
		}
		
		DbStatic dbs = new DbStatic();
		
	}

}
