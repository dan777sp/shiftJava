package aula_03;

import java.util.Scanner;

public class EstruturaSwitch {

	public static void main(String[] args) {
		/*
		 * Crie um programa que permita ao usu�rio escolher o elogio que gostaria de
		 * receber, de acordo com a seguinte regra: 1 - Elogio profissional, 2 - Elogio
		 * f�sico, 3 - Elogio pessoal Caso digite qualquer outro n�mero, deve ser
		 * exibida a mensagem "op��o inv�lida"
		 */
		Scanner leitor = new Scanner(System.in);
		int opcao;
		System.out.println("ELOGIADOR!");
		System.out.println("Selecione a opcao desejada:\n1-Elogio profissional\n2-Elogio fisico\n3-Elogio pessoal");
		opcao = leitor.nextInt();
		leitor.close();
		// Aqui precisamos de uma estrutura para validar a opcao inserida.

		switch (opcao) {
		case 1:
			System.out.println("Voce eh um excelente profissional");
			break;
		case 2:
			System.out.println("Voce tem um otimo fisico");
			break;
		case 3:
			System.out.println("Voce eh uma otima pessoa");
			break;
		default:
			System.out.println("Opcao invalida");
		}

	}

}
