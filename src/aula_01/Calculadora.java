package aula_01;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		float valor1 = leitor.nextFloat();
		System.out.println("Digite o segundo valor: ");
		float valor2 = leitor.nextFloat();		
		leitor.close();
		
		float soma = valor1 + valor2;
		float sub = valor1 - valor2;
		float mult = valor1 * valor2;
		float div = valor1 / valor2;
		
		System.out.println("Soma: " + valor1 + " + " + valor2 + " = " + soma);
		System.out.println("Subtracao: " + valor1 + " - " + valor2 + " = " + sub);
		System.out.println("Multiplicacao: " + valor1 + " * " + valor2 + " = " + mult);
		System.out.println("Divisao: " + valor1 + " / " + valor2 + " = " + div);
	}

}
