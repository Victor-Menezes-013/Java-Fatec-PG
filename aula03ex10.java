package aula;
import java.util.Scanner;
public class aula03ex10 {
/*10. Número Perfeito
Um número é perfeito se a soma de seus divisores (excluindo ele mesmo) for igual ao número.
     Ex: 6 → 1 + 2 + 3 = 6
    Peça um número e diga se ele é perfeito.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite um número: ");
      int n = sc.nextInt();
      double l = Math.sqrt(n);
      int d = 1;
      for (int i = 2; i < l; i++) {
    	  if (n % i == 0) {
    		  d += i + (n/i);
    		  System.out.println(d);
    		  System.out.println(i);
          }
      }
      if(d == n) {
    	  System.out.println("Esse número é perfeito!");}
      else {
    	  System.out.println("Esse númeronão é perfeito");
      }
      sc.close();
	}

}
