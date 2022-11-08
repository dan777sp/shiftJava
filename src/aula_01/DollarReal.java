package aula_01;

import java.util.Scanner;

public class DollarReal {

	public static void main(String[] args) {
			
		
		double dolar = 0;
		double real = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o valor da doação em dolar: ");
		dolar = leitor.nextDouble();
		leitor.close();
		
		real = dolar * 5.04;
		
		
		System.out.println("Valor da doação em reais: " + real);
		
	}

}
