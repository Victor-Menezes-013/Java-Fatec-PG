package aula;

public class aula02operadores {

	public static void main(String[] args) {
		/* Operadores relacionais: Permitem comparar valores. Retornam verdadeiro (true) ou falso (false). 
		 * (== igual | != diferente | > maior | < menor | >= maior ou igual | <= menor ou igual)
		 */
		int idade = 18;
		System.out.println("idade = 18");
		System.out.print("idade >= 18 -> ");
		System.out.println(idade >= 18); // true
		System.out.print("idade != 20 -> ");
		System.out.println(idade != 20); // true

		/* Operadores lógicos: Usados para combinar expressões booleanas.
		 *  (&& (E) | || (OU) | ! (NÃO))
		 */
		boolean maior = true;
		boolean possuiConvite = false;
		System.out.println("maior = true");
		System.out.println("possuiConvite = true");
		System.out.print("maior && possuiConvite -> ");
		System.out.println(maior && possuiConvite); // false
		System.out.print("maior || possuiConvite -> ");
		System.out.println(maior || possuiConvite); // true
		System.out.print("!maior -> ");
		System.out.println(!maior); // false

	}

}
