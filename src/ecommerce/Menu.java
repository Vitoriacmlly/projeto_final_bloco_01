package ecommerce;

import ecommerce.controller.EcommerceController;
import ecommerce.model.Produto;
import ecommerce.model.ProdutoPincel;
import ecommerce.model.ProdutoTela;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		EcommerceController produtos = new EcommerceController();

		Scanner leia = new Scanner(System.in);

		int opcao, numero, tipo;
		String nome, descricao, cerdas;
		double preco;
		float tamanho;

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

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 6) {
				System.out.println("\nSHOPArt .Storage - A segunda casa de um Artista.");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Produto\n\n");

				System.out.println("Digite o nome do Produto: ");
				leia.skip("\\R?");
				nome = leia.nextLine();

				do {
					System.out.println("Digite o tipo do Produto (1-Pincel ou 2-Tela): ");
					tipo = leia.nextInt();
				} while (tipo < 1 || tipo > 2);

				System.out.println("Digite o valor do Produto (R$): ");
				preco = leia.nextDouble();

				System.out.println("Descreva o Produto: ");
				leia.skip("\\R?");
				descricao = leia.nextLine();

				numero = produtos.gerarNumero();

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o tipo das cerdas do Pincel: ");
					cerdas = leia.next();
					ProdutoPincel novoProduto = new ProdutoPincel(numero, nome, descricao, tipo, preco, cerdas);
					produtos.cadastrar(novoProduto);

				}
				case 2 -> {
					System.out.println("Digite o tamanho (cm) da Tela: ");
					tamanho = leia.nextFloat();
					ProdutoTela produtoAtualizado = new ProdutoTela(numero, nome, descricao, tipo, preco, tamanho);
					produtos.cadastrar(produtoAtualizado);
				}
				}

				keyPress();
				break;
			case 2:
				System.out.println("Lista de todos os produtos: \n\n");
				produtos.listarTodas();

				keyPress();
				break;
			case 3:
				System.out.println("Consultar dados do Produto por Id\n\n");

				System.out.println("Digite o Id do Produto: ");
				numero = leia.nextInt();

				produtos.procurarPorNumero(numero);

				keyPress();
				break;
			case 4:
				System.out.println("Atualizar dados do Produto\n\n");

				System.out.println("Digite o Id do produto: ");
				numero = leia.nextInt();

				var buscaProduto = produtos.buscarNaCollection(numero);

				if (buscaProduto != null) {

					tipo = buscaProduto.getTipo();

					System.out.println("Digite o nome do produto: ");
					nome = leia.next();
					System.out.println("Digite a descricao do Produto: ");
					leia.skip("\\R?");
					descricao = leia.next();
					System.out.println("Digite o preco do Produto(R$): ");
					preco = leia.nextDouble();

					switch (tipo) {
					case 1 -> {
						System.out.println("Digite o tipo de cerda do Pincel: ");
						cerdas = leia.next();

						ProdutoPincel produtoAtualizado = new ProdutoPincel(numero, nome, descricao, tipo, preco,
								cerdas);

						produtos.atualizar(produtoAtualizado);
					}
					case 2 -> {
						System.out.println("Digite o tamanho da Tela (cm): ");
						tamanho = leia.nextFloat();

						ProdutoTela produtoAtualizado = new ProdutoTela(numero, nome, descricao, tipo, preco, tamanho);

						produtos.atualizar(produtoAtualizado);
					}
					default -> {
						System.out.println("Tipo de produto Invalido!");
					}

					}
				} else {
					System.out.println("O Produto nao foi encontrado!");
				}

				keyPress();
				break;
			case 5:
				System.out.println("Apagar Produto\n\n");

				System.out.println("Digite o Id do Produto: ");
				numero = leia.nextInt();

				produtos.deletar(numero);

				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				keyPress();
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

	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
