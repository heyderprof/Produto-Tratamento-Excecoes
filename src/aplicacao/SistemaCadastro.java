package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import entidades.Produto;
import excecoes.PrecoInvalidoException;

public class SistemaCadastro {

	public static void main(String[] args) {
		
		try {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** CADASTRO DE PRODUTO ***");
		
		System.out.print("NOME: ");
		String nome = sc.nextLine();
		
		System.out.print("CATEGORIA: ");
		String categoria = sc.nextLine();
		
		System.out.print("PREÇO: ");
		double preco = sc.nextDouble();
		
		System.out.print("QUANTIDADE: ");
		int qtd = sc.nextInt();
		
		Produto p = new Produto(nome, categoria, preco, qtd);
		
		sc.close();
		
		System.out.println(p);
		
		} catch (InputMismatchException e) {
			System.out.println("ERRO: Formato de dado inválido");
			
		} catch (PrecoInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("\nExecução Finalizada");
		}
		

	}

}
