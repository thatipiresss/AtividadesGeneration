package HerençaPOO;

public class Cavalo extends Animal {

	//String nome, String tipoAnimal, int idade, String som, String acao	

	private int nSeleiro;
	private String porte;
	private String cor;
	
public Cavalo (String tipoAnimal, String nome, int idade, String som, String acao, int nSeleiro, String porte, String cor) {
	
 		super (tipoAnimal, nome, idade, som, acao);
 		this.nSeleiro = nSeleiro;
 		this.porte = porte;
 		this.cor = cor;

}

public int getnSeleiro() {
	return nSeleiro;
}

public void setnSeleiro(int nSeleiro) {
	this.nSeleiro = nSeleiro;
}

public String getPorte() {
	return porte;
}

public void setPorte(String porte) {
	this.porte = porte;
}

public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}

public void imprimirInfo(){
	System.out.println("\n O animal é um "+getTipoAnimal()+" de nome: "+getNome()+ " que tem "
	+getIdade()+ " ano(s). \nO som que esse animal emite é: "+getSom()+ " e ele costuma "
		+getAcao()+".\nOutras características sobre o animal:\n Nº DO SELEIRO: "+getnSeleiro()+
		"; \nPORTE: "+getPorte()+ "; \n COR: "+getCor()+";");
	}}
