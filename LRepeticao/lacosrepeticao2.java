package LRepeticao;

import java.util.Scanner;

public class lacosrepeticao2 {

		public static void main (String[] arg) {
			
			int x, numero, numerosImpares = 0, numerosPares =0 ; 
			Scanner leia = new Scanner (System.in);
			
		for (x=0; x<10; x++) {
			System.out.println("\nEntre com um n�mero: ");
			numero = leia.nextInt();
			
		
				if (numero%2==0) {
					numerosPares+=1;
				
				}else {
					numerosImpares+=1;
				
				}
			}
			System.out.println("\nO total de n�meros pares inseridos foi de: "+numerosPares);
			System.out.println("\nO total de n�meros �mpares inseridos foi de: "+numerosImpares);
			
		}
		}
