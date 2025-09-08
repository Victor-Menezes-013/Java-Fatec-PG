package aula;
import java.util.Scanner;
public class aula03ex14 {
/*14. Potência com Laço
Peça dois inteiros "base" e "expoente".
   Calcule "base^expoente", porém sem utilizar "Math.pow"*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println("Digite a base: ");
  int b = sc.nextInt();
  System.out.println("Digite o expoente: ");
  int e = sc.nextInt();
  int r = 1;
  for (int i = 1; i <= e; i++) {
      r *= b;
  }

  System.out.println(b + "^" + e + " = " + r);
  sc.close();
	}

}
