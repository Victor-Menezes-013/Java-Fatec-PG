package aula;

import java.util.Scanner;

public class Aula03DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha;
		
		do {
			System.out.println("Digite a senha: ");
			senha = sc.nextInt();
		} while (senha != 1234);
		System.out.println("Acesso permitido!");

	}

}
