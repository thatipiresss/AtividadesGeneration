package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExercicio {


public static void main(String[] args) {
			
			int op;
			Scanner ler = new Scanner(System.in);
			ArrayList <String> estoque = new ArrayList<String>();
			
			do {
			System.out.println("\n\t\t Escolha uma das opções à seguir: ");
			System.out.println("\n\t (1) Adicionar produto");
			System.out.println("\n\t (2) Remover produto");
			System.out.println("\n\t (3) Atualizar produtos");
			System.out.println("\n\t (4) Visualizar produtos");
			op = ler.nextInt();
			switch (op)
			{
			case 1:
				ler.nextLine();
				System.out.println("\n\t Qual produto deseja adicionar?");
				String produto = ler.nextLine();
				estoque.add(produto);
				break;
			case 2:
				ler.nextLine();
				System.out.println("\n\tQual produto deseja remover?");
				String produtor = ler.nextLine();
				if(estoque.contains(produtor))
				{
					estoque.remove(op);
				}
				else
				{
					System.out.println("\n PRODUTO NÃO LOCALIZADO! ");
				}
				break;
			case 3:
				ler.nextLine();
				System.out.println("\nQual produto deseja atualizar?");
				String verifica = ler.nextLine();
				System.out.println("\n\t Entre com o nome do novo produto: ");
				String novo = ler.nextLine();
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\n PRODUTO NÃO LOCALIZADO! ");
				}
				break;
			case 4:
				System.out.println("\n\t*****ESTOQUE****** ");
				System.out.println(estoque);
				break;
			}
			}while (op!=0);

		}

}
