package POO;

public class Funcionario {

	
	/*Crie uma classe funcionário ok
	 *  e apresente os atributos ok
	 *   métodos  ok
	 * referentes esta classe, em seguida crie um objeto
	 *  funcionário, defina as instancias deste objeto e 
	 *  apresente as informações deste objeto no console.
	 */
	
	private String nome;
	private int idade;
	private int anos;
	private int meses;
	private String cargo;
	private float salario;
	
public Funcionario (String nome, int idade, int anos, int meses, String cargo, float salario) {
	
	this.nome = nome;
	this.idade = idade;
	this.anos = anos;
	this.meses = meses;
	this.cargo = cargo;
	this.salario = salario;
	
}

public void imprimirInfo() {
	
	System.out.println("\n O(a) funcionário(a) "+nome+ " tem "+idade+ " anos e trabalha"
			+ " conosco há "+ anos+ " ano(s) e "+meses+ " mes(es). \nAtualmente seu cargo é de "
			+cargo+ " e seu salário é de R$"+salario+".");
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

public int getAnos() {
	return anos;
}

public void setAnos(int anos) {
	this.anos = anos;
}

public int getMeses() {
	return meses;
}

public void setMeses(int meses) {
	this.meses = meses;
}

public float getSalario() {
	return salario;
}

public void setSalario(float salario) {
	this.salario = salario;
}


}
