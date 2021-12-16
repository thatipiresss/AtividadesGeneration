package HerençaPOO;

public class Cachorro extends Animal{

//String nome, String tipoAnimal, int idade, String som, String acao	
	private String raca;
	private String cor;
	

	public Cachorro (String tipoAnimal, String nome, int idade, String som, String acao,String raca, String cor) {
		
		super (tipoAnimal, nome, idade, som, acao);
		this.raca = raca;
		this.cor = cor;
		
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}

	
	public void imprimirInfo() {
		System.out.println("\n O animal é um "+getTipoAnimal()+" de nome: "+getNome()+ " que tem "
		+getIdade()+ " ano(s). \nO som que esse animal emite é: "+getSom()+ " e ele costuma "
			+getAcao()+".\n\t\t *Outras características sobre o animal*\n Ele é de raça "+getRaca()+ " e tem a cor "+getCor()+".");
	}
}
