package ecommerce.model;


public class ProdutoTela extends Produto{
	
	private float tamanho;

	public ProdutoTela(int numero, String nome, String descricao, int tipo, double preco, float tamanho) {
		super(numero, nome, descricao, tipo, preco);

	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tamanho da Tela: " + this.tamanho);
	}

}
