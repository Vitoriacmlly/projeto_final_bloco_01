package ecommerce.repository;

import ecommerce.model.Produto;

public interface EcommerceRepository {
	
	public void procurarPorNumero(int numero);
	public void listarTodas();
	public void cadastrar();
	public void atualizar();
	public void deletar(int numero);
	
	

}
