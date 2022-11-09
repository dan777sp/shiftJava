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

		if (ouro > bronze && ouro > prata) {
			System.out.println("Ouro eh o metal mais pesado");
		} else if (ouro > bronze || ouro < prata && bronze < prata) {
			System.out.println("Prata eh o metal mais pesado");
		} else if (bronze > ouro || bronze > prata) {
			System.out.println("Bronze eh o metal mais pesado");
		}

	}
}
