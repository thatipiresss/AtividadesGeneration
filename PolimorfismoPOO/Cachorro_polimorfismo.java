package PolimorfismoPOO;

public abstract class Cachorro_polimorfismo extends BaseAnimal implements Animal {
	
	//String tipoAnimal, String nome, int idade, String som, String acao
	
	public Cachorro_polimorfismo (String tipoAnimal, String nome, int idade, String som, String acao) {
		
	super (tipoAnimal, nome, idade, som, acao);
}
	
	@Override
	public void habito (String hab) {
		System.out.println("Correr");
		
	}
	
	@Override
	public void barulho (String som) {
		System.out.println("au, au, au, rrrshrrrr");
		
	}
	public void imprimirInfo() {
		
	}
	
	
	
}
