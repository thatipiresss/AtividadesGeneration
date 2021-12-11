package PraticandoJava;

import java.util.Scanner;

public class exercicio1 {

	 public static void main(String[] args) {
					
		 
		 int idade, mes, dia ;
		 Scanner leia = new Scanner (System.in);
		 
		 System.out.println ("Qual sua idade? ");
		 idade = leia.nextInt();
		 System.out.println (idade+" anos e quantos meses?");
		 mes = leia.nextInt();
		 System.out.println (idade+ " anos "+ mes+ " meses e quantos dias?");
		 dia = leia.nextInt();
		 System.out.println ("UAU, você tem "+ (idade*365+mes*30+dia)+" dias de vida!!!");

			}
		}	 
	

	 