package ecommerce.model;

public abstract class Produto {

	private int numero;
	private String nome;
	private String descricao;
	private int tipo;
	private double preco;

	public Produto(int numero, String nome, String descricao, int tipo, double preco) {
		this.numero = numero;
		this.nome = nome;
		this.descricao = descricao;
		this.tipo = tipo;
		this.preco = preco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Pincéis";
			break;
		case 2:
			tipo = "Telas";
			break;
		}

		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("***********************************************************");
		System.out.println("Id do Produto: " + this.numero);
		System.out.println("Produto: " + this.nome);
		System.out.println("Tipo do Produto: " + tipo);
		System.out.println("Descricao: " + this.descricao);
		System.out.println("Preco (R$): " + this.preco);

	}
}
