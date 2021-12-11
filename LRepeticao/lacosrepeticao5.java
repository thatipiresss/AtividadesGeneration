package LRepeticao;

import java.util.Scanner;

public class lacosrepeticao5 {

		public static void main (String[] args) {
			Scanner leia = new Scanner (System.in);

		
			int num, somaNum=0;
			
		
		do {
			System.out.println ("\nAtenção: PARA INTERROMPER A CONTAGEM, DIGITE '0'. \nDigite um número:");
			num = leia.nextInt();
				somaNum+= num;
				
			} while (num!=0);
			System.out.println ("\nA soma dos números digitados foi de: "+somaNum+".");
				
				
	
		
					
		}
}
