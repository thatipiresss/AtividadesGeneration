package POO;


//1. Crie uma classe cliente - ok 
//2. Apresente os atributos  - ok
//3. Apresente os métodos referentes a classe - ok
//4. Crie um objeto cliente - ok 
//5. Defina as instancias desse objeto - ok
//6. Apresente as informações desse objeto no console - ok

public class Cliente {

		private String nome;
		private String endereco;
		private int idade;
		private double valorCompra;
		
	
public Cliente (String nome, String endereco, int idade, double valorCompra) 
{
					
		this.nome= nome;
		this.endereco = endereco;
		this.idade = idade;
		this.valorCompra = valorCompra;
		
}

	public void imprimirInfo() {
		System.out.println("\n O(a) cliente: "+nome+" residente na "+ endereco+ ", tem "
	+ idade + " anos e gastou R$"+valorCompra+" em nossa loja!");
		
	}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}

public String getEndereco() {
	return nome;
}
public void setEndereco(String nome) {
	this.nome = nome;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public double getValorCompra() {
	return valorCompra;
}
public void setValorCompra(double valorCompra) {
	this.valorCompra = valorCompra;
}


}


