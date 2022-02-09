package dal;

import java.util.ArrayList;
import java.util.List;

import model.Persona;

public class Database {

	private static Database db;
	private List<Persona> listaPersone;
	
	private Database() {
		listaPersone = new ArrayList<Persona>();
		listaPersone.add(new Persona("aldo", "verdi", "aldoverdi", "1234"));
		listaPersone.add(new Persona("giovanni", "bianchi", "giovannibianchi", "1111"));
		listaPersone.add(new Persona("giacomo", "rossi", "giacomorossi", "4321"));
	}
	
	public static Database getDatabase() {
		if(db == null) {
			db = new Database();
		}		
		return db;
	}
	
	public List<Persona> getListaPersone() {
		return this.listaPersone;
	}
}
