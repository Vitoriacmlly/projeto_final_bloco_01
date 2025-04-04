package ecommerce.repository;

import ecommerce.model.Produto;

public interface EcommerceRepository {
	
	public void procurarPorNumero(int numero);
	public void listarTodas();
	public void deletar(int numero);
	void cadastrar(Produto produto);
	void atualizar(Produto produto);
	
	

}
