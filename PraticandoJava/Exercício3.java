package PraticandoJava;

import java.util.Scanner;

public class Exercício3 {

	public static void main (String[] args) {
		
		int hr, min, segundos, resto, resto2, resultado;
		Scanner leia = new Scanner (System.in);
		
		System.out.println ("Quantos segundos durou o evento da fábrica?");
		
		segundos = leia.nextInt();
		hr = segundos/3600;
		resto= segundos%3600;
		min= resto/60;
		resto2= resto%60;
		resultado= resto2;
		
 	System.out.println ("Uau, o evento durou "+ hr+" horas "+ min+" minutos e "+ resultado+" segundos!");
 	
	}
}

