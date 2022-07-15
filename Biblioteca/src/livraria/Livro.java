package livraria;

public class Livro {
	
	String titulo;
	String autor;
	String isbn;
	int ano;
	String editora;
	String estado;
	
	public void inicializarBiblioteca() {
		titulo = "NULL";
		autor = "NULL";
		isbn = "NULL";
		ano = 0;
		editora = "NULL";
	}
	public void cadastrarLivro(String titulo, String autor, String isbn, int ano, String editora) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.ano = ano;
		this.editora = editora;
		this.estado = "disponivel";
	}
	public void procurarLivro(String searchLivro) {
		
		if(searchLivro.equals(this.titulo)) {
			System.out.println("Título: " + this.titulo);
			System.out.println("Autor: " + this.autor);
			System.out.println("ISBN: " + this.isbn);
			System.out.println("Ano: " + this.ano);
			System.out.println("Editora: " + this.editora);
		}
		
	}
	
	public void removerLivro(String searchLivro) {
		if(searchLivro.equals(this.titulo)) {
			
			this.titulo = "NULL";
			this.autor = "NULL";
			this.isbn = "NULL";
			this.ano = 0;
			this.editora = "NULL";
			System.out.println("Livro removido!");
			this.estado = "removido";

		}
	}
	
	public void emprestarLivro(String searchLivro) {
		
		if(searchLivro.equals(this.titulo) && this.estado.equals("disponivel")) {
			System.out.println("Livro emprestado!");
			this.estado = "emprestado";

		}
	}
	
	public void devolverLivro(String searchLivro) {
		if(searchLivro.equals(this.titulo) && this.estado.equals("emprestado")) {
			System.out.println("Livro devolvido!");
			this.estado = "disponivel";

		}
	}
	
	public void listarLivrosEmprestados() {
		if(this.estado.equals("emprestado")) {
			System.out.println("Título: " + this.titulo);
			System.out.println("Autor: " + this.autor);
			System.out.println("ISBN: " + this.isbn);
			System.out.println("Ano: " + this.ano);
			System.out.println("Editora: " + this.editora);
		}
		
	}
	
	public void listarLivrosDisponiveis() {
		if(this.estado.equals("disponivel")) {
			System.out.println("Título: " + this.titulo);
			System.out.println("Autor: " + this.autor);
			System.out.println("ISBN: " + this.isbn);
			System.out.println("Ano: " + this.ano);
			System.out.println("Editora: " + this.editora);
		}
		
	}
	
}
