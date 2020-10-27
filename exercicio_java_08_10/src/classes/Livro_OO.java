package classes;

public class Livro_OO {
/* atributos*/
	
private String titulo; 	
private String isbn;
private String autor;
private String editora;
private String genero;

private String anoPublicacao;


/* metodos*/

public  void imprimirDados() {}
public void tempoPublicacao () {}		


/*encapsulamento*/

public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public String getEditora() {
	return editora;
}
public void setEditora(String editora) {
	this.editora = editora;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public String getAnoPublicacao() {
	return anoPublicacao;
}
public void setAnoPublicacao(String anoPublicacao) {
	this.anoPublicacao = anoPublicacao;
}

/*construtores*/ 

public Livro_OO(String titulo) {
this.titulo = titulo;
}
public Livro_OO(String titulo, String isbn, String autor, String editora, String genero, String anoPublicacao) {
	super();
	this.titulo = titulo;
	this.isbn = isbn;
	this.autor = autor;
	this.editora = editora;
	this.genero = genero;
	this.anoPublicacao = anoPublicacao;
	
}
/* Sorecarga */
public Livro_OO(String titulo, String autor, String editora, String genero) {
	super();
	this.titulo = titulo;
	this.autor = autor;
	this.editora = editora;
	this.genero = genero;
	
	
}	









	
	
	
}
