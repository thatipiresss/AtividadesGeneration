package Heren�aPOO;

public class Preguica extends Animal {

	private String cor;
	private String cidade;
	//String tipoAnimal, String nome, int idade, String som, String acao
	
public Preguica (String tipoAnimal, String nome, int idade, String som, String acao, String cor, String cidade) {
	
	super (tipoAnimal, nome, idade, som, acao);
	this.cor = cor;
	this.cidade = cidade;
}

public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}

public String getCidade() {
	return cidade;
}

public void setCidade(String cidade) {
	this.cidade = cidade;
}

public void imprimirInfo() {
//	//String tipoAnimal, String nome, int idade, String som, String acao, cor, cidade
	System.out.println("O " +getTipoAnimal()+ " foi apelidado de "+getNome()+ " tem "+getIdade()+
			" ano(s). \nO som que esse animal emite � o "+getSom()+ " e ele costuma "+
			getAcao()+". \nOutras caracter�sticas sobre o animal: \nCOR: "+getCor()+
			"; \nCIDADE(HABITAT): "+getCidade()+";");
}
}
