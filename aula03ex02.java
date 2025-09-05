package aula;
import java.util.Scanner;
public class aula03ex02 {
/*2. Contagem Progressiva e Regressiva
Solicite ao usuário um número inteiro positivo.
    Exiba a contagem progressiva de 0 até esse número.
    Exiba a contagem regressiva até 0.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Digite um número inteiro positivo para a contagem progressiva e regressiva: ");
     int n = sc.nextInt();
     int c = 0;
     for (int i = n; i >= c; i--) {
    	 System.out.println(i);
     }
     for (int i = c; i <=n ; i++) {
    	 System.out.println(i);
     }
     
     sc.close();
	}

}
