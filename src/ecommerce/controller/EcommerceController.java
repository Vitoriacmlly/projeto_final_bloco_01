package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Produto;
import ecommerce.repository.EcommerceRepository;

public class EcommerceController implements EcommerceRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var produto = buscarNaCollection(numero);

		if (produto != null) {
			produto.visualizar();
		} else
			System.out.println("\nO Produto: " + numero + " nao foi encontrado!");

	}

	@Override
	public void listarTodas() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}

	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO Produto número: " + produto.getNumero() + " foi adicionado a Storage com sucesso!");

	}

	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getNumero());

		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nO Produto " + numero + " foi atualizado com sucesso!");
		} else
			System.out.println("\nO Produto " + numero + " nao foi encontrado");

	}

	@Override
	public void deletar(int numero) {
		var produto = buscarNaCollection(numero);

		if (produto != null) {
			if (listaProdutos.remove(produto) == true)
				System.out.println("\nO Produto: " + numero + " foi deletado com sucesso!");
		} else {
			System.out.println("\nO Produto: " + numero + "nao foi encontrado!");
		}

	}

	public int gerarNumero() {
		return ++numero;
	}

	public Produto buscarNaCollection(int numero) {
		for (var produto : listaProdutos) {
			if (produto.getNumero() == numero) {
				return produto;
			}
		}
		return null;
	}

}
