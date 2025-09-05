package aula;
import java.util.Scanner;

public class aula02ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade:");
		int i = sc.nextInt();
		if (i>=18) {
			System.out.println("Você é maior de idade!");
		} else System.out.println("Você é menor de idade!");
		sc.close();
	}

}
