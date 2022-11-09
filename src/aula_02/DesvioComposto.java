package aula_02;

import java.util.Scanner;

public class DesvioComposto {

	public static void main(String[] args) {
		double doacao, investimento, taxa;
		System.out.println("Digite o valor da doacao:");
        Scanner leitor = new Scanner(System.in);
        doacao = leitor.nextDouble();
        leitor.close();
        
        if (doacao < 1000) {
            taxa = doacao * 0.05;
        }else {
        	taxa = doacao * 0.15;        	
        }
        
        investimento = doacao - taxa;
        
        System.out.println("A doacao de " + doacao + " com taxa de " + taxa + " ira gerar um investimento de: " + investimento);
	}

}
