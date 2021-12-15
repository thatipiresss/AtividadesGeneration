package POO;

public class ContaBancaria {
	
	private String titular;
	private String tipo;
	private String banco;
	private int ag;
	private String conta;
	private float saldo;
	
	
public ContaBancaria (String titular, String tipo, String banco, int ag, String conta, float saldo) {
	


	this.titular = titular;
	this.tipo = tipo;
	this.banco = banco;
	this.ag = ag;
	this.conta = conta;
	this.saldo = saldo;

}

public void imprimirInfo() {
		System.out.println ("\n O(a) cliente: "+titular+ " possui uma conta "+tipo+ " na instituição bancária "+banco
				+".");
		System.out.println ("\n\t\t---DADOS DA CONTA---");
		System.out.println ("\nBanco: "+banco+"\nAgência: "+ag+"\nconta: "+conta+"\nSALDO ATUAL: "+saldo+".");
						
}

public String getTitular() {
	return titular;
}

public void setTitular(String titular) {
	this.titular = titular;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public String getBanco() {
	return banco;
}

public void setBanco(String banco) {
	this.banco = banco;
}

public int getAg() {
	return ag;
}

public void setAg(int ag) {
	this.ag = ag;
}

public String getConta() {
	return conta;
}

public void setConta(String conta) {
	this.conta = conta;
}

public float getSaldo() {
	return saldo;
}

public void setSaldo(float saldo) {
	this.saldo = saldo;
}

}
