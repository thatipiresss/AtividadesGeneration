package POO;

public class Aviao {

	
	//1Crie uma classe avi�o - ok
	//2. apresente os atributos - ok
	//3. apresente os m�todos referentes esta classe - ok
	//4. Crie um objeto avi�o ok
	//5. Defina as instancias deste objeto - ok
	//6. Apresente as informa��es deste objeto no console. ok
	
	
	private String companhiaAerea;
	private String cor;
	private int ano;
	private String porte;
	
	
	
public Aviao (String companhiaAerea, String cor, int ano, String porte) {
	
	this.companhiaAerea = companhiaAerea;
	this.cor = cor;
	this.ano = ano;
	this.porte = porte;
}

public void imprimirInfo() {
	System.out.println("\n O avi�o da companhia A�ra: "+ companhiaAerea +" tem "
			+ "a cor "+ cor+", foi fabricado em " + ano +" e � de porte " + porte +"!");
	
}

public String getCompanhiaAerea() {
	return companhiaAerea;
}

public void setCompanhiaAerea(String companhiaAerea) {
	this.companhiaAerea = companhiaAerea;
}

public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}

public int getAno() {
	return ano;
}

public void setAno(int ano) {
	this.ano = ano;
}
public String getPorte() {
	return porte;
}

public void setPorte(String porte) {
	this.porte = porte;
}
	
		

	}
