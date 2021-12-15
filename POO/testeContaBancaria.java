package POO;

public class testeContaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String titular, String tipo, String banco,  int ag, String conta, float saldo 
		
		ContaBancaria conta1 = new ContaBancaria ("Felipe Melo", "corrente", 
				"Itaú", 2541, "2548-9", 3655981);
		ContaBancaria conta2 = new ContaBancaria ("Joana Feliciano", "poupança", "Banco do Brasil",
				4587, "36547-8", 1254);
		ContaBancaria conta3 = new ContaBancaria ("Thatiane Maria Pires de Camargo", "corrente", "SumUp BANK",
				0001, "45216524-8", 556214);
		ContaBancaria conta4 = new ContaBancaria ("Maria Josefina da Costa", "poupança",
				"Caixa Econômica Federal", 1258, "01300045817-2", 352);
		ContaBancaria conta5 = new ContaBancaria ("Arthur Aparício", "poupança",
				"Intermedium", 4521, "22514-4", 2256);
		
		conta1.imprimirInfo();
		conta2.imprimirInfo();
		conta3.imprimirInfo();
		conta4.imprimirInfo();
		conta5.imprimirInfo();
	}

}
