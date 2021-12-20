package Polimorfismo;

//Não foi finalizado


import PolimorfismoPOO.Animal;
import PolimorfismoPOO.Cachorro_polimorfismo;
import PolimorfismoPOO.Cavalo_polimorfismo;
import PolimorfismoPOO.Cavalo_polimosfismo;
import PolimorfismoPOO.Preguica_polimorfismo;

public class TestePolimorfismo {

	public static void main(String[] args) {
		CachorroPolimorfismo cachorro = new CachorroPolimorfismo();
		CavaloPolimorfismo cavalo; //= new Cavalo_polimorfismo();
		PreguicaPolimorfismo preguica; //= new Preguica_polimorfismo();
		Animal animal = null;
		cachorro.imprimirInfo();
		cachorro.barulho(null);
		cachorro.habito(null);
		System.out.println("\n");
		cavalo.imprimirInfo();
		cavalo.barulho(null);
		cavalo.habito(null);
		System.out.println("\n");
		preguica.imprimirInfo();
		preguica.barulho(null);
		preguica.habito(null);
	}
}
