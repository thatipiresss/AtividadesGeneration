package PolimorfismoPOO;

public class TestePolimorfismo {

	
	public static void main(String[] args) {
		Cachorro_polimorfismo cachorro = new Cachorro_polimorfismo();
		Cavalo_polimosfismo cavalo = new Cavalo_polimorfismo();
		Preguica_polimorfismo preguica = new Preguica_polimorfismo();
		Animal animal = null;
		cachorro.imprimirInfo();
		cachorro.barulho(null);
		cachorro.habito(null);
		System.out.println("\n");
		cavalo.imprimirinfo();
		cavalo.barulho(null);
		cavalo.habito(null);
		System.out.println("\n");
		preguica.imprimirInfo();
		preguica.barulho(null);
		preguica.habito(null);
	}
}
