package aula_05;

import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) {
		// media de nota dos alunos
//		int qtdAlunos;
//		double nota = 0, media = 0;
//
//		Scanner leitor = new Scanner(System.in);
//		System.out.println("Digite a quantidade de alunos:");
//		qtdAlunos = leitor.nextInt();
//
//		for (int i = 0; i < qtdAlunos; i++) {
//			System.out.println("Digite a nota do aluno " + (i + 1) + ":");
//			nota = leitor.nextDouble();
//			media = media + nota;
//		}
//		leitor.close();
//
//		System.out.println("A media dos " + qtdAlunos + " alunos eh de: " + String.format("%.1f", (media / qtdAlunos)));
		
		// media de nota dos alunos pares e impares
				int qtdAlunos;
				double nota = 0, mediaPares = 0, mediaImpares = 0;

				Scanner leitor = new Scanner(System.in);
				System.out.println("Digite a quantidade de alunos:");
				qtdAlunos = leitor.nextInt();

				for (int i = 0; i < qtdAlunos; i++) {
					System.out.println("Digite a nota do aluno " + (i + 1) + ":");
					nota = leitor.nextDouble();
					if ((i+1) % 2 == 0) {
						mediaPares = mediaPares + nota;
					} else {
						mediaImpares = mediaImpares + nota;
					}
						
				}
				
				leitor.close();

				System.out.println("A media dos alunos pares é de: " + String.format("%.1f", (mediaPares / qtdAlunos * 2)));
				System.out.println("A media dos alunos impares eh de: " + String.format("%.1f", (mediaImpares / qtdAlunos * 2)));

	}

}
