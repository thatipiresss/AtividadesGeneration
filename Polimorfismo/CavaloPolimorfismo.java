package Polimorfismo;

public abstract class CavaloPolimorfismo extends BaseAnimalPolimorfismo implements Animalpolimorfismo{

	
public CavaloPolimorfismo (String tipoAnimal, String nome, int idade, String som, String acao) {
		
		super (tipoAnimal, nome, idade, som, acao);
	}
	
	@Override
	public void habito (String hab) {
		System.out.println("Correr");
		
	}
	
	@Override
	public void barulho (String som) {
		System.out.println("ihiiiiiiiiii ihhiiiiiiiii, pocotó, pocotó....");
		
	}
	public void imprimirInfo() {
		
	}
	
	
	
}
