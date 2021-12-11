package LRepeticao;

import java.util.Scanner;

public class lacosrepeticao3 {
	
		public static void main (String[] arg) {
			
		int idade, menores21 = 0, maiores50= 0;
		Scanner leia = new Scanner (System.in);	
		
		System.out.println ("\nATENÇÃO: PARA INTERROMPER A CONTAGEM, DIGITE '-99'.");
	System.out.println("\nEntre com a idade: ");
		idade=leia.nextInt();
				
		while(idade!=-99){
			
			if(idade<21){
				menores21++;
			}
			else if (idade>50){
				maiores50++;
			}
			else if (idade ==-99){
				System.out.println("Programa finalizado!");
			}
			System.out.println("\nEntre com a idade: ");
			idade=leia.nextInt();
		}
		System.out.println("\nO número de pessoas menores de 21 anos é: "+menores21+".");
		System.out.println("\nO número de pessoas maiores de 50 anos é de "+maiores50+".");
		
		}
}
	
		