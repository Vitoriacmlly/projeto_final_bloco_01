package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                      ShopArt                        ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produto                    ");
			System.out.println("            2 - Listar todos as Produtos             ");
			System.out.println("            3 - Buscar Produto por Id                ");
			System.out.println("            4 - Atualizar Produto                    ");
			System.out.println("            5 - Apagar Produto                       ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("****************************************************\n");
			System.out.println("Digite a opção desejada:                             ");

			opcao = leia.nextInt();
			

			if (opcao == 6) {
				System.out.println("\nSHOPArt .Storage - A segunda casa de um Artista.");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Cadastrar Produto\n\n");

					break;
				case 2:
					System.out.println("Listar todos dos Produtos\n\n");

					break;
				case 3:
					System.out.println("Consultar dados do Produto por Id\n\n");

					break;
				case 4:
					System.out.println("Atualizar dados do Produto\n\n");

					break;
				case 5:
					System.out.println("Apagar Produto\n\n");

					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n*****************************************\n");
		System.out.println("Projeto Desenvolvido por: Vitoria Camilly");
		System.out.println("vcamilly18@gmail.com");
		System.out.println("github.com/Vitoriacmlly");
		System.out.println("\n*******************************************");
	}
	
}
