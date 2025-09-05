package aula;
import java.util.Scanner;
public class aula03ex05 {
/*5. Números Primos
Peça um número ao usuário e diga se ele é primo.
    Dica: use Math.sqrt(n) para limitar as divisões até a raiz quadrada.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int c = 0;
     System.out.println("Digite um número: ");
     int n = sc.nextInt();
     if(n <= 1)
    	 System.out.println("Não é primo!");
     if(n == 2) 
		System.out.println("É primo!");
	 for (int i = 1; i <= n; i++) {
		 if(n % i == 0) {
			 c++;
		 }
	 }
	 if(c > 2) {
		 System.out.println("Não é primo!");
	 }
	 else {
		 System.out.println("É primo!");
	 }
     
     sc.close();
	}

}
