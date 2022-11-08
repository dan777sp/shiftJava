package aula_01;

import java.util.Scanner;

public class Autonomia {

	public static void main(String[] args) {
		float kminicial;
		float kmfinal;
		float abstecimento;
		float aut;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o valor da quilometragem inicial: ");
		kminicial = leitor.nextFloat();
		System.out.println("Digite o valor da quilometragem final: ");
		kmfinal = leitor.nextFloat();
		System.out.println("Digite a quantidade de litros do abastecimento: ");
		abstecimento = leitor.nextFloat();
		leitor.close();
		
		aut = (kmfinal - kminicial) / abstecimento;
		
		System.out.println("O valor da autonomia eh de: " + aut + " quilometrs por litro");
	}

}
