package aula;
import java.util.Scanner;
public class aula03ex15 {
/*15. Múltiplos de 3 e 5 entre 1 e 100
Exiba todos os números entre 1 e 100 que são múltiplos de 3 ou 5, mas não de ambos.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println("Números múltiplos de 3 ou 5, mas não de ambos (1 a 100):");

  for (int i = 1; i <= 100; i++) {
      if ((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0)) {
          System.out.print(i + " ");
      }
  }

  sc.close();
	}

}
