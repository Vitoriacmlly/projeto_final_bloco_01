package ecommerce.model;


public class ProdutoPincel extends Produto{
	
	private String cerdas;

	public ProdutoPincel(int numero, String nome, String descricao, int tipo, double preco, String cerda) {
		super(numero, nome, descricao, tipo, preco);
		this.cerdas = cerda;
	}

	public String getCerda() {
		return cerdas;
	}


	public void setCerda(String cerda) {
		this.cerdas = cerda;
	}

	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tipo de certa do Pincél: " + this.cerdas);
	}

}
