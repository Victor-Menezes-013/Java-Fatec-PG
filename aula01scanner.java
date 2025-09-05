package aula;
/*
 * Classe Scanner (java.util.Scanner) é utilizada para capturar dados
 *  digitados pelo usuário no console.
 * É necessário importar a classe
 *  
 */
import java.util.Scanner;

public class aula01scanner {
	public static void main(String[] args) {
		/*
		 * instanciar a classe (variável sc para capturar os dados)
		 */
		Scanner sc = new Scanner(System.in); 
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		//System.out.println("O nome digitado é: " + nome);
		System.out.print("Digite sua idade: ");
		// nextInt: lê um número inteiro
		int idade = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite sua cidade: ");
		String cidade = sc.nextLine();
		System.out.println(nome + " a sua idade é: " + idade + " e vc está em " + cidade);
				
		/*
		 * next(): lê apenas uma palavra (até o primeiro espaço ou enter)
		 * nextLine(): lê a linha inteira, incluindo os espaços
		 * nextInt(): lê um número inteiro
		 * nextDouble(): lê um número decimal (utiliza ponto como separador)
		 * nextBoolean(): lê valores lógicos (true / false)
		 * next().charAt(0): usado para capturar apenas um caracter
		 * 
		 */
		sc.close();
	}

}
