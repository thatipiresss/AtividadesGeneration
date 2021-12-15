package POO;

public class ProdutoEletronico {

	//1. Crie uma classe produto eletrônicov- ok
	//2.Apresente os atributos - ok 
	//3. Apresente os métodos métodos referentes esta classe ok
	//4. Crie um objeto produto eletrônico ok
	//5. defina as instancias deste objeto ok
	//6. apresente as  informações deste objeto no console. ok
	 
private String Produto;
private float Valor;


		public ProdutoEletronico (String Produto, float Valor) {
	
	this.Produto = Produto;
	this.Valor = Valor;

}
	
			public void imprimirInfo(){
	System.out.println("O produto eletronico é um "+Produto+ " e custou R$"+Valor+".");


}

			public String getProduto() {
				return Produto;
			}

			public void setProduto(String produto) {
				Produto = produto;
			}

			public float getValor() {
				return Valor;
			}

			public void setValor(float valor) {
				Valor = valor;
			}

}
