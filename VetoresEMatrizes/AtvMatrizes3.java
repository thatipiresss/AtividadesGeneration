package VetoresEMatrizes;

import java.util.Scanner;

public class AtvMatrizes3 {

	
public static void main (String [] args) {
		
		Scanner leia = new Scanner (System.in);
		int coluna=0, linha=0, contagem=0;
		int [][]valores = new int [3][3];
		
		//5,6,7,8,9,10,11,12,13
		
		
		for (linha=0; linha<3; linha++) {
			
			for (coluna=0; coluna<3; coluna++) {
				
				System.out.println ("\nEscreva um número");
				valores[linha][coluna] = leia.nextInt();
				
			if (valores[linha][coluna] >10) {
				
				contagem++;
				
				
			}
		}
			}			
			
			System.out.println("\nForam adicionados "+ contagem+ " números maiores do que 10!");
			
			for (linha=0; linha<3; linha++) {
				
				for (coluna=0; coluna<3; coluna++) {
					
					
					if (valores[linha][coluna] > 10) {   
				
		        System.out.println (valores[linha][coluna]);
		        
	     		        	
		        
		 
				}
					}
				}
			}
}
