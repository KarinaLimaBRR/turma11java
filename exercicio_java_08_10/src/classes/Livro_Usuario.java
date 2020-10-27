package classes;

public class Livro_Usuario {

	public static void main(String[] args) {
		Livro_OO livro =new Livro_OO("Livro","Autor","Editor","Genero");
		
	System.out.println(livro.getTitulo());	
	System.out.println(livro.getAutor());
	System.out.println(livro.getEditora());
	System.out.println(livro.getGenero());

	}
}
