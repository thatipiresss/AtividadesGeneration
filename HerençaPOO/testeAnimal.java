	package HerençaPOO;

public class testeAnimal {

	//String tipoAnimal, String nome, int idade, String som, String acao
	//CACHORRO STRINGS RACA COR
	// CAVALOINT  N SELERIO, STRING PORTE, COR
	//PREGUICA COR CIDADE
	
	
	/*String tipoAnimal, String nome, int idade, String som, String acao, 
	 * String cor, String cidade) {
	 */
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro cachorro1 = new Cachorro ("Cachorro", "Rex", 2, "au au", "correr", "Shitzu", "preto");
		Cavalo cavalo1 = new Cavalo ("Cavalo", "nina", 7, "iiiiiiiiiihii", "correr", 5, "Grande", "branco");
		Preguica preguica1 = new Preguica ("Bicho Preguiça", "Preguicinha", 9, "undefinided", "Subir em arvore", "marrom", "Indaiatuba" );
		cachorro1.imprimirInfo();
		System.out.println("\n***************************");
		cavalo1.imprimirInfo();
		System.out.println("\n***************************");
		preguica1.imprimirInfo();
		System.out.println("\n***************************");
	}

}
