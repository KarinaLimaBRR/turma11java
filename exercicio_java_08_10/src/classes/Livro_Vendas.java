package classes;

public class Livro_Vendas extends Livro_OO {
	/*atributos	*/	
	
private String dataVendas;
private String nomeProprietario;
private String valorVenda;

/* metodos*/
public void calculaValor() {}


/*encapsulamento*/

public String getDataVendas() {
	return dataVendas;
}

public void setDataVendas(String dataVendas) {
	this.dataVendas = dataVendas;
}

public String getNomeProprietario() {
	return nomeProprietario;
}

public void setNomeProprietario(String nomeProprietario) {
	this.nomeProprietario = nomeProprietario;
}

public String getValorVenda() {
	return valorVenda;
}

public void setValorVenda(String valorVenda) {
	this.valorVenda = valorVenda;
}

/*construtores*/ 

public Livro_Vendas(String titulo, String isbn, String autor, String editora, String genero, String anoPublicacao,
		String dataVendas, String nomeProprietario, String valorVenda) {
	super(titulo, isbn, autor, editora, genero, anoPublicacao);
	this.dataVendas = dataVendas;
	this.nomeProprietario = nomeProprietario;
	this.valorVenda = valorVenda;
}







	
	
	
	
	
	
}
