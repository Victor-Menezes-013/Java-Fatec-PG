package aula;
import java.util.Scanner;
public class aula03ex07 {
/*7. Tabuada de um Número
Peça ao usuário um número inteiro de 1 a 10 e exiba a tabuada dele (de 1 a 10)*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número de 0 a 10 para a tabuada:");
    int t = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
    	System.out.println(t+" x "+i+" = "+(t*i));
    }
    sc.close();
	}

}
