package POO;

public class testeCliente {

	
	//String nome, String endereco, int idade, double valorCompra
	public static void main (String[] args) {
		

		
	Cliente cliente1 = new Cliente ("Thatiane Pires", "Rua 7 de Setembro, 557 - Vila Atl�ntica - Mongagu�/Sp",
			25, 3725);
	Cliente cliente2 = new Cliente ("Maria Jos�", "Rua 7 de Setembro, 690 - Vila Atl�ntica - Mongagu�/Sp",
			92, 135);
	Cliente cliente3 = new Cliente ("Pedro Anselmo", "Rua da catatumba, 1 - Parque Centen�rio - Jundiai/Sp",
					36, 104);
	Cliente cliente4 = new Cliente ("Z� felipe", "Rua XV de Novembro, 447 - N Sra de F�tima - Guaruj�/Sp",
			29, 4582);
	Cliente cliente5 = new Cliente ("Alice Apar�cio", "Rua 2, 123 - Vila Nova - S�o Paulo/Sp",
			18, 1250);
		
	cliente1.imprimirInfo();
	cliente2.imprimirInfo();
	cliente3.imprimirInfo();
	cliente4.imprimirInfo();
	cliente5.imprimirInfo();
		
		
	}
}

	
