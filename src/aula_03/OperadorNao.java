package aula_03;
import java.util.Scanner;

public class OperadorNao {

	public static void main(String[] args) {
		/*Crie um programa que permita que receba o tipo de um usu�rio em uma vari�vel String e caso esse tipo N�O SEJA "administrador", exibir a mensagem: "Aten��o, usu�rio sem poderes administrativos. Algumas tarefas ser�o bloqueadas".*/
		Scanner leitor = new Scanner(System.in);
		String tipoUsuario;
		System.out.println("Por favor, digite seu tipo de usuario:");
		tipoUsuario = leitor.next();
		leitor.close();
		//Aqui � preciso criar um if que verifique se o tipo de usu�rio digitado � DIFERENTE de "administrador"
		
		if (!tipoUsuario.equals("administrador")) {
			System.out.println("Usuario sem poderes administrativos.\nAlgumas tarefas serao bloqueada");
		} else {
			System.out.println("Bem-Vindo " + tipoUsuario + " :)");
		}
		

	}

}
