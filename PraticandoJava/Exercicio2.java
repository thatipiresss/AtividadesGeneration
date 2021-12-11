package PraticandoJava;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int dia, mes, ano, dias, resto, resto2, resultado;
		 Scanner leia = new Scanner (System.in);

		 System.out.println("Há quantos dias você está nesse mundo?");
		 dia = leia.nextInt();
		 ano = dia/365;
		 resto = dia%365;
		 mes = resto/30;
		 resto2 = resto%30;
		 resultado = resto2;
		 
		 System.out.println("Você tem "+ ano+" anos "+ mes+" meses e "+ resultado+ " dia(s) de vida!");
	}
	
}

