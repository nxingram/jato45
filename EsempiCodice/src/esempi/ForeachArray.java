package esempi;

public class ForeachArray {

	
	public static void main(String[] args) {
		
		// Il nome dell'array è utile se è "parlante"
		// cioè capisco già dal nome cosa contiene e di che tipo è la variabile.
		String[] nomiArray = {"Carlo", "Anna", "Francesca", "Domenico"};
		
		System.out.println("Ciclo For:\n");
		// Stampa i nomi con un ciclo for con contatore
		for (int i = 0; i < nomiArray.length; i++) {
			System.out.println(nomiArray[i]);
		}
		
		// Separatore
		System.out.println("\n----------------------------\n");
		
		System.out.println("Ciclo Foreach:\n");
		// Stampa i nomi con un ciclo foreach "for migliorato/enhanced"
		for (String nome : nomiArray) {
			System.out.println(nome);
		}
		
	}
}
