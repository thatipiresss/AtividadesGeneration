package POO;

public class testeAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//(String companhiaAerea, int ano, String cor, String porte)
		
	
		Aviao aviao1 = new Aviao ("LATAM", "branco",  2019, "médio");
		Aviao aviao2 = new Aviao ("GOL", "branco",2020, "grande");
		Aviao aviao3 = new Aviao ("AZUL", "branco", 2017, "pequeno");
		
		aviao1.imprimirInfo();
		aviao2.imprimirInfo();
		aviao3.imprimirInfo();
		
		
	}

}
