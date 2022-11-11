package aula_04;

import java.text.Format;
import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		double somaALturas = 0.0, media;
		int i = 0, qtdAlunos = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de alunos: ");
		qtdAlunos = leitor.nextInt();
		
		while (i < qtdAlunos) {
			System.out.println("Digite a altura do aluno " + (i+1) + ": ");
			somaALturas = somaALturas + leitor.nextDouble();
			i++;
		}
		
		leitor.close();
		media = somaALturas / 6;
		
		System.out.println("A media de altura dos " + qtdAlunos + " alunos eh de " + String.format("%.2f", media));

	}

}
