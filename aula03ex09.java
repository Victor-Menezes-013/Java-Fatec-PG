package aula;
import java.util.Scanner;
public class aula03ex09 {
/*9. Fatorial de um Número
Peça um número inteiro positivo ao usuário e calcule seu fatorial (n!)*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc= new Scanner(System.in);
   System.out.println("Digite um número para calcular seu fatorial: ");
   int n = sc.nextInt();
   int r=1;
   for (int i = 1; i <= n; i++) {
   r *= i;
   }
   System.out.println(r);
   
   sc.close();
	}

}
