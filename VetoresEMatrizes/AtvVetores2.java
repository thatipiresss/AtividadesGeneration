package VetoresEMatrizes;

import java.util.Scanner;

public class AtvVetores2 {
	
public static void main (String[] args) {
		
		int x, somaPar=0, somaImpar=0, pares, impares;
		int  numeros[] = new int [6];
		Scanner leia = new Scanner (System.in);
		
	for (x=0; x<6; x++){
		
		System.out.println("\nEntre com um número: ");
		numeros[x] = leia.nextInt();
		
			
			if (numeros[x] % 2 == 0){
				
				somaPar += numeros[x];
	
				
			} else if (numeros[x] % 2 == 1){
				
					somaImpar++;
												
			}
			
				
		
	}
		System.out.println("\nA soma dos números pares é de: "+ somaPar+ ".");
		System.out.println("\n Os números pares digitados foram: ");
		
		
		for (x=0; x<6; x++){
		
					if (numeros[x] % 2 ==0) {
						
					System.out.println(numeros[x]);
		}
			
		}
		
		System.out.println("\n A quantidade de números ímpares digitados foi de: "+ somaImpar+ ".");
		System.out.println("\n Os números ímpares digitados foram: ");
		
		for (x=0; x<6; x++){
			
			if (numeros[x] % 2 ==1) {
				
			System.out.println (numeros[x]);
		
			}
		}	
		}
}


	
	