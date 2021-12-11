package LDecisao;

import java.util.Scanner;

public class lacosdecisao1 {

public static void main (String[] args) {
		
		int num1, num2, num3;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com o primeiro número: ");
			num1 = leia.nextInt();
		
		System.out.println("Entre com o segundo número: ");
			num2 = leia.nextInt();
			
		System.out.println("Entre com o terceiro número: ");
			num3 = leia.nextInt();
			
		if (num1>=num2 && num1>=num3) {
			
				System.out.println ("\nO número "+ num1+ " foi o maior número digitado!");
	
		}	else if (num2>=num3 && num2>=num1) {
			
				System.out.println ("\nO número " +num2+ " foi o maior número digitado!");
		}else if (num3>=num2 && num3>=num1) {
			
				System.out.println ("\nO número " + num3 + " foi o maior número digitado!");
		}
		
	}
}
