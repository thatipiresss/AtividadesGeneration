package LRepeticao;

import java.util.Scanner;

public class lacosrepeticao5 {

		public static void main (String[] args) {
			Scanner leia = new Scanner (System.in);

		
			int num, somaNum=0;
			
		
		do {
			System.out.println ("\nAten��o: PARA INTERROMPER A CONTAGEM, DIGITE '0'. \nDigite um n�mero:");
			num = leia.nextInt();
				somaNum+= num;
				
			} while (num!=0);
			System.out.println ("\nA soma dos n�meros digitados foi de: "+somaNum+".");
				
				
	
		
					
		}
}
