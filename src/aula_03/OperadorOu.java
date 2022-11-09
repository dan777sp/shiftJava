package aula_03;
import java.util.Scanner;

public class OperadorOu {

	public static void main(String[] args) {
		/*Fa�a um programa que receba o total de compras de um usu�rio e um cupom. Se o total de compas exceder 1000 ou se o cupom for igual a DESCONTO20, aplicar um desconto de 20% na compra*/
		Scanner leitor = new Scanner(System.in);
		Double totalCompra, valorFinal=0.0;
		String cupom;
		System.out.println("SISTEMA DE DESCONTOS");
		System.out.println("Por favor, digite o valor total da compra");
		totalCompra = leitor.nextDouble();
		System.out.println("Por favor, digite o seu cupom");
		cupom = leitor.next();
		
		//Aqui � preciso criar um if que verifique as duas condi��es para que o desconto seja ou n�o aplicado
		
		System.out.println("O valor final � de R$" + valorFinal);

	}

}
