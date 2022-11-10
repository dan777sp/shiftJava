package aula_02;

import java.util.Scanner;

public class BalancaMetais {

	public static void main(String[] args) {

		float ouro, prata, bronze;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o peso do ouro: ");
		ouro = leitor.nextFloat();
		System.out.println("Digite o peso do prata: ");
		prata = leitor.nextFloat();
		System.out.println("Digite o peso do bronze: ");
		bronze = leitor.nextFloat();

		leitor.close();
		
		//com if encadeado
		/*
		 * if (ouro > prata) { if (ouro > bronze) {
		 * System.out.println("Ouro é o metal mais pesado"); } else {
		 * System.out.println("Bronze é o metal mais pesado"); } } else { if (prata >
		 * bronze) { System.out.println("Prata é o metal mais pesado"); } else {
		 * System.out.println("Bronze é o metal mais pesado"); } }
		 * 
		 * //com operadores if (ouro > prata && ouro > bronze) {
		 * System.out.println("Ouro é o metal mais pesado"); } else if (prata > bronze)
		 * { System.out.println("Prata é o metal mais pesado"); } else {
		 * System.out.println("Bronze é o metal mais pesado"); }
		 */

		if (ouro > bronze && ouro > prata) {
			System.out.println("Ouro eh o metal mais pesado");
		} else if (prata > bronze && prata > bronze && prata != ouro) {
			System.out.println("Prata eh o metal mais pesado");
		} else if (bronze > ouro && bronze > prata) {
			System.out.println("Bronze eh o metal mais pesado");
		} else if (bronze == prata && bronze != ouro) {
			System.out.println("Bronze eh igual ao Prata e sao mais pesados que o Ouro");
		} else if (bronze == ouro && bronze != prata) {
			System.out.println("Bronze eh igual ao Ouro e sao mais pesados que o Prata");
		} else if (prata == ouro && bronze != prata) {
			System.out.println("Prata eh igual ao Ouro e sao mais pesados que o Bronze");
		} else if (prata == ouro || prata == bronze || ouro == bronze) {
			System.out.println("Todos os metais tem o mesmo peso");
		} else {
			System.out.println("Dados de entrada invalidos");
		}

	}
}
