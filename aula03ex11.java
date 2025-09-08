package aula;
import java.util.Scanner;
public class aula03ex11 {
/*11. Contar Dígitos Pares e Ímpares
Peça ao usuário um número inteiro.
    Conte quantos dígitos são pares e quantos são ímpares*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o número: ");
	String n = sc.nextLine();
	int e=0, o=0;
	int c = 0;
    for (int i = 0; i < n.length(); i++) {
		c = (int)(n.charAt(i));
		if (c % 2 == 0 && c != '0') {
			e++;
		} else if (c != '0') {
			o++;
		}
	}
	System.out.println("Quantidade de caracteres pares: " + e);
	System.out.println("Quantidade de caracteres ímpares: " + o);
	
    
    sc.close();
	}

}
