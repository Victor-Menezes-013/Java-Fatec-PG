package aula;
import java.util.Scanner;

public class aula02ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int n = sc.nextInt();
		if(n == 0 ) {
			System.out.println("O número " + n +" é zero!");
		} else if ((n % 2) == 0) {
			System.out.println("O número " + n + " é par!");
		} else if ((n % 2) != 0) {
			System.out.println("O numero "+ n +" é ímpar!");
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
