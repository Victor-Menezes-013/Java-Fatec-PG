package aula;
import java.util.Scanner;
import java.util.Locale;


public class aula02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
		System.out.println("Digite um número inteiro: ");
		int x = sc.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		double y = sc.nextDouble();
		
		System.out.println("Letra: ");
		char letra = sc.next().charAt(0);
		
		System.out.println("Palavra: ");
		String palavra = sc.next();
		sc.nextLine();
		
		System.out.println("Linha: ");
		String linha = sc.nextLine();
		
		System.out.println("Mostra os valores ->\n x = " + x +"\n y = " + y +"\n letra = " + letra + "\n palavra = " + palavra + "\n Linha = " + linha);
	    sc.close();
	    
	
	}
	

}
