package test;

import java.util.ArrayList;

public class DbStatic {
	
	public static ArrayList<Persona> lista = new ArrayList<Persona>();
	
	// blocco inizializzazione statico - eseguito anche se non viene chiamato il metodo costruttore
	static {
		lista.add(new Persona("nome1", "cognome1"));
		lista.add(new Persona("nome2", "cognome2"));
		lista.add(new Persona("nome3", "cognome3"));
		System.out.println("static blocco inizializzazione");
	}
	
	// blocco inizializzazione - eseguito solo se viene chiamato il metodo costruttore
	{
		System.out.println("blocco inizializzazione");	
	}
	
	public DbStatic() {
		System.out.println("costruttore");
	}
	
}
