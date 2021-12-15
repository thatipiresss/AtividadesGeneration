package POO;

public class testeCliente {

	
	//String nome, String endereco, int idade, double valorCompra
	public static void main (String[] args) {
		

		
	Cliente cliente1 = new Cliente ("Thatiane Pires", "Rua 7 de Setembro, 557 - Vila Atlântica - Mongaguá/Sp",
			25, 3725);
	Cliente cliente2 = new Cliente ("Maria José", "Rua 7 de Setembro, 690 - Vila Atlântica - Mongaguá/Sp",
			92, 135);
	Cliente cliente3 = new Cliente ("Pedro Anselmo", "Rua da catatumba, 1 - Parque Centenário - Jundiai/Sp",
					36, 104);
	Cliente cliente4 = new Cliente ("Zé felipe", "Rua XV de Novembro, 447 - N Sra de Fátima - Guarujá/Sp",
			29, 4582);
	Cliente cliente5 = new Cliente ("Alice Aparício", "Rua 2, 123 - Vila Nova - São Paulo/Sp",
			18, 1250);
		
	cliente1.imprimirInfo();
	cliente2.imprimirInfo();
	cliente3.imprimirInfo();
	cliente4.imprimirInfo();
	cliente5.imprimirInfo();
		
		
	}
}

	
