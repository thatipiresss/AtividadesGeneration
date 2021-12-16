	package HerençaPOO;

public class testeAnimal {

	//String tipoAnimal, String nome, int idade, String som, String acao
	//CACHORRO STRINGS RACA COR
	// CAVALOINT  N SELERIO, STRING PORTE, COR
	//PREGUICA COR CIDADE
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro cachorro1 = new Cachorro ("Cachorro", "Rex", 2, "au au", "correr", "Shitzu", "preto");
		Cavalo cavalo1 = new Cavalo ("Cavalo", "nina", 7, "iiiiiiiiiihii", "correr", 5, "Grande", "branco");
		Preguica preguica1 = new Preguica ("Bicho Preguiça", "soninho", 3, "Subir em árvores", "marrom", "Mongaguá");
		
		cachorro1.imprimirInfo();
		cavalo1.imprimirInfo();
		preguica1.imprimirInfo();
	}

}
