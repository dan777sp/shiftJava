package aula_04;

import java.util.Scanner;

public class ExerciciosLoopWhile {

	public static void main(String[] args) {
		// Exercicio 1 - Exibir os numeros de 1 a 100

		
//		int i = 0, f = 100;
//
//		while (i < f) {
//			System.out.println(i + 1);
//			i++;
//		}
		 

		// Exercicio 2 - Exibir os numeros pares de 100 a 0

		
//		int i = 100, f = 1;
//
//		while (i > f) {
//			if (i % 2 == 0) {
//				System.out.println(i);			
//			}
//			i --;
//		}
		 

		// Exercicio 3 - Exibir a soma dos numeros de 0 a 100

		
//		int soma = 0, i = 1, f = 100;
//
//		while (i <= f) {
//			soma = soma + i;
//			i++;
//		}
//		System.out.println("Soma dos numeros de 1 a 100 = " + soma);
		 

		// Exercicio 4 - Exibir os numeros impares de 0 a 1000; se numero = 567, interromper o programa.
		
		
//		int i = 0, f = 1000, x = 567;
//
//		while (i < f) {
//			if (i % 2 != 0) {
//				System.out.println(i);
//			}
//			if (i == x) {
//				System.out.println("Chegamos no numero: " + i + "\nFinalizando o programa.");
//				break;
//			}
//			i++;
//		}
		 
		
		// Exercicio 5 - Exibir os numeros de 50 a 100, exceto os numeros de 51 e 75
		
		
//		int i = 50, f = 100, x = 51, y = 75;
//
//		while (i < f) {
//			if (i == x || i == y) {
//				i++;
//			} else {
//				System.out.println(i);
//				i++;
//			}
//		}
		 
//		int opcao = 0;
//		Scanner leitor = new Scanner(System.in);
//
//		while (opcao != 4) {
//			System.out.println("ESTRUTURA DE MENUS");
//			System.out.println("Suas opcoes sao:\n1-Opcao 1\n2-Opcao 2\n3-Opcao 3\n4-Sair");
//			opcao = leitor.nextInt();
//			switch (opcao) {
//			case 1:
//				System.out.println("Voce escolheu a opcao 1");
//				break;
//			case 2:
//				System.out.println("Voce escolheu a opcao 2");
//				break;
//			case 3:
//				System.out.println("Voce escolheu a opcao 3");
//				break;
//			case 4:
//				System.out.println("Ok! Saindo do sistema...");
//				break;
//			default:
//				System.out.println("A opcao escolhida nao existe...");
//			}
//		}
//		leitor.close();
		
//		1.Usuário informa um número e o programa calcula o fatorial deste número
		
//		int i = 0;
//		double fatorial = 0;
//		String result;
//		Scanner leitor = new Scanner(System.in);
//		System.out.println("Digite o valor para calcular o fatorial:");
//		fatorial = i = leitor.nextInt();
//		result = i + "! = " + i + " * ";
//		leitor.close();
//
//		if (i == 0) {
//			System.out.println(i + "! = 1");
//		} else {
//
//			while (i > 1) {
//				i--;
//				fatorial = fatorial * i;
//				if (i != 1) {
//					result = result + i + " * ";
//				} else {
//					result = result + i + " = ";
//				}
//
//			}
//			System.out.println(result + fatorial);
//		}
		
		
		
		
//		2.Criar um sistema de validação de usuário. Enquanto o usuário e a senha forem inválidos manter o loop. Ao final exibir a qtd de tentativas
		
		
		int i = 1;
		String usuario = "dan", senha = "123";
		
		Scanner leitor = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("Digite o usuario: ");
			usuario = leitor.next();
			System.out.println("Digite a senha:");
			senha = leitor.next();
			if (usuario.equals("dan") && senha.equals("123")) {
				System.out.println("Bem vindo " + usuario + "\nTentativas: " + i);
				break;
			} else {
				i++;
			}
		}
		leitor.close();
		
		
	}

}
