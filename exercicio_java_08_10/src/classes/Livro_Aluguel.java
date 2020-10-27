package classes;

public class Livro_Aluguel extends Livro_OO {

/*atributos	*/

private String nomeLocador;
private String diasLocacao;
private String mesLocacao;
private String anoLocacao;

/* metodos*/
public void valorLocacao() {}
public void devolucao() {}


/*encapsulamento*/
public String getNomeLocador() {
	return nomeLocador;
}
public void setNomeLocador(String nomeLocador) {
	this.nomeLocador = nomeLocador;
}
public String getDiasLocacao() {
	return diasLocacao;
}
public void setDiasLocacao(String diasLocacao) {
	this.diasLocacao = diasLocacao;
}
public String getMesLocacao() {
	return mesLocacao;
}
public void setMesLocacao(String mesLocacao) {
	this.mesLocacao = mesLocacao;
}
public String getAnoLocacao() {
	return anoLocacao;
}
public void setAnoLocacao(String anoLocacao) {
	this.anoLocacao = anoLocacao;
}

/*construtores*/ 

public Livro_Aluguel(String titulo, String isbn, String autor, String editora, String genero, String anoPublicacao,
		String nomeLocador, String diasLocacao, String mesLocacao, String anoLocacao) {
	super(titulo, isbn, autor, editora, genero, anoPublicacao);
	this.nomeLocador = nomeLocador;
	this.diasLocacao = diasLocacao;
	this.mesLocacao = mesLocacao;
	this.anoLocacao = anoLocacao;
}




	

	
	
	
	
	
	
	
	
}
