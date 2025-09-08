package aula;
import java.util.Scanner;
/*13. Soma dos N primeiros números pares
Peça um número "n", e calcule a soma dos "n" primeiros pares positivos.*/
public class aula03ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.println("Digite um número: ");
   int n = sc.nextInt();
   int s = 0;
   for (int i = 1; i <= n; i++) {
   	s += i * 2;
   }
   System.out.println("A soma dos " + n + " primeiros números pares é: " + s);
   sc.close();
	}

}
