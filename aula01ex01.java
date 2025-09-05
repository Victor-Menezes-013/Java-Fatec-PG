package aula;
import java.util.Scanner;
public class aula01ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
 System.out.print("Digite o nome do aluno: ");
 String nome = sc.nextLine();
 System.out.print("Digite a primeira nota: ");
 int nota1 = sc.nextInt();
 System.out.print("Digite a segunda nota: ");
 int nota2 = sc.nextInt();
 System.out.println("A média do aluno " + nome + " é " + (nota1+nota2)/2 );
 sc.close();
	}

}
