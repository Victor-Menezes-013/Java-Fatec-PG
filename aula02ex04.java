package aula;
import java.util.Scanner;

public class aula02ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
 System.out.println("Digite a nota do aluno: ");
 double nota = sc.nextDouble();
 if (nota < 6)
	 System.out.println("Sua nota é D (DÓ)!");
 else if (nota < 8)
	 System.out.println("Sua nota é C!");
 else if (nota <= 9.4)
	 System.out.println("Sua nota é B!");
 else if (nota >= 9.5)
	 System.out.println("Sua nota é A!");
 
 
 sc.close();
	}

}
