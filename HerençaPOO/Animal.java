package HerençaPOO;

public class Animal {


	private String tipoAnimal;
	private String nome;
	private int idade;
	protected String som;
	private String acao;

	

public Animal (String tipoAnimal, String nome, int idade, String som, String acao){
	
	this.tipoAnimal = tipoAnimal;
	this.nome = nome;
	this.idade = idade;
	this.som = som;
	this.acao = acao;
	
}

public String getTipoAnimal() {
	return tipoAnimal;
}

public void setTipoAnimal(String tipoAnimal) {
	this.tipoAnimal = tipoAnimal;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public String getSom() {
	return som;
}

public void setSom(String som) {
	this.som = som;
}

public String getAcao() {
	return acao;
}

public void setAcao(String acao) {
	this.acao = acao;
}


}
