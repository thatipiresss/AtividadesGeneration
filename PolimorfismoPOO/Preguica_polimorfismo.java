package PolimorfismoPOO;

public abstract class Preguica_polimorfismo extends BaseAnimal implements Animal {

	//String tipoAnimal, String nome, int idade, String som, String acao

	
		public Preguica_polimorfismo (String tipoAnimal, String nome, int idade, String som, String acao) {
			
			super (tipoAnimal, nome, idade, som, acao);
		}
		
		@Override
		public void habito (String hab) {
			System.out.println("Subir em arvores");
			
		}
		
		@Override
		public void barulho (String som) {
			System.out.println("ZzZZzZ.... ZzzzZzzZz");
			
		}
		public void imprimirInfo() {
			
		}
	}

