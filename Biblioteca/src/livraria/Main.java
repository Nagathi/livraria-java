package livraria;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String titulo, autor, isbn, editora, estado;
		int ano;
		
		//Aqui você seleciona quantos livros deseja cadastrar e o tamanho da sua biblioteca, defini 3 pra facilitar.
		//A biblioteca inicialmente era para ter 200 livros
		
		Livro[] l1 = new Livro[3];

		for(int i=0; i < l1.length; i++){
			
		l1[i] = new Livro();
		}

		
		//Encontrei essa outra forma também
		
		/*List lista = new ArrayList();

		for(int i=0;i<200;i++){
		lista.add(new Livro());
		}*/
		
		System.out.println("\n===== Livraria =====\n");
		System.out.println(" 1-Cadastrar livro ");
		System.out.println(" 2-procurar livro ");
		System.out.println(" 3-Retirar livro ");
		System.out.println(" 4-Emprestar livro ");
		System.out.println(" 5-Devolver livro ");
		System.out.println(" 6-Listar livros emprestados ");
		System.out.println(" 7-Listar livros disponíveis ");
		System.out.println(" 0-Sair \n");
	    
		System.out.println("Escolha uma opção: ");
		int op = sc.nextInt();
		
		while(op != 0) {
			
			if(op == 1) {
			
				
				for(int i=0; i < l1.length; i++){
					
					System.out.println("Nome do livro: ");
					titulo = sc.next();
					System.out.println("Nome do autor: ");
					autor = sc.next();
					System.out.println("Código isbn: ");
					isbn = sc.next();
					System.out.println("Ano de publicação: ");
					ano = sc.nextInt();
					System.out.println("Nome da editora: ");
					editora = sc.next();
					
					l1[i].cadastrarLivro(titulo, autor, isbn, ano, editora);
					
				}
				
			}
			
			if(op == 2) {
				
				System.out.println("Digite o nome do livro: ");
				String searchLivro = sc.next();
				
				
				for(int i=0; i < l1.length; i++){
					
					l1[i].procurarLivro(searchLivro);
					
				}
			}
			
			if(op == 3) {
				System.out.println("Digite o nome do livro: ");
				String searchLivro = sc.next();
				
				
				for(int i=0; i < l1.length; i++){
					
					l1[i].removerLivro(searchLivro);
					
				}
			}
			
			if(op == 4) {
				System.out.println("Digite o nome do livro: ");
				String searchLivro = sc.next();
				
				for(int i=0; i < l1.length; i++){
					
					l1[i].emprestarLivro(searchLivro);
					
				}
			}
			
			if(op == 5) {
				System.out.println("Digite o nome do livro: ");
				String searchLivro = sc.next();
				
				for(int i=0; i < l1.length; i++){
					
					l1[i].devolverLivro(searchLivro);
					
				}
			}
			
			if(op == 6) {
				for(int i=0; i < l1.length; i++){
					
					l1[i].listarLivrosEmprestados();
					
				}
			}
			
			if(op == 7) {
				
				for(int i=0; i < l1.length; i++){
					
					l1[i].listarLivrosDisponiveis();
					
				}
			}

			System.out.println("\n===== Livraria =====\n");
			System.out.println(" 1-Cadastrar livro ");
			System.out.println(" 2-procurar livro ");
			System.out.println(" 3-Retirar livro ");
			System.out.println(" 4-Emprestar livro ");
			System.out.println(" 5-Devolver livro ");
			System.out.println(" 6-Listar livros emprestados ");
			System.out.println(" 7-Listar livros disponíveis ");
			System.out.println(" 0-Sair \n");
		    
			System.out.println("Escolha uma opção: ");
			op = sc.nextInt();

		}
		
	}

}
