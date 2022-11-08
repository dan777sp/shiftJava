package aula_01;

import java.util.Scanner;

public class Saudacao {

	public static void main(String[] args) {
		
		System.out.println("Digite o nome: ");
		Scanner leitor = new Scanner(System.in);
		String nome = leitor.next();
		
		System.out.println("Bem vindo: " + nome);
		leitor.close();
		
	}

}
