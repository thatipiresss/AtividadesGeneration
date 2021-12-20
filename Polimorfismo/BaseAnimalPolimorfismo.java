package Polimorfismo;

public abstract class BaseAnimalPolimorfismo {


	protected String tipoAnimal;
	protected String nome;
	protected int idade;
	protected String som;
	protected String acao;

	
BaseAnimalPolimorfismo (String tipoAnimal, String nome, int idade, String som, String acao)
{

	this.tipoAnimal = tipoAnimal;
	this.nome = nome;
	this.idade = idade;
	this.som = som;
	this.acao = acao;
	
}

abstract public void habito (String hab);
abstract public void barulho (String som);




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