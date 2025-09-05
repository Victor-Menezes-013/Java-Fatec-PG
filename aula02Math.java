package aula;

public class aula02Math {

	public static void main(String[] args) {
		/* Operações matemáticas adicionais (biblioteca Math): Além das operações básicas, podemos utilizar a classe Math para cálculos mais avançados.
		 * Principais métodos:
		 *	• Math.sqrt(x) → raiz quadrada
		 *	• Math.pow(base, expoente) → potência
		 *	• Math.abs(x) → valor absoluto
		 *	• Math.max(a, b) e Math.min(a, b) → maior e menor valor
		 *	• Math.round(x), Math.ceil(x), Math.floor(x) → arredondamentos
		 */
		int n = 16;
		System.out.println("Raiz quadada de " + n + " é : " + Math.sqrt(n)); // 4.0
		
		double potencia = Math.pow(2, 3);
		System.out.println("2 elevado ao cubo é " + potencia); // 8.0
		
		System.out.println("O maior valor entre 10 e 20 é " + Math.max(10, 20)); // 20
		System.out.println("O menor valor entre 10 e 20 é " + Math.min(10, 20)); // 10
		
		double valor = 8.75;
		System.out.println("Arredonda " + valor + " para número inteiro mais próximo: " + Math.round(valor)); // 9
		System.out.println("Arredonda " + valor + " para cima: " + Math.ceil(valor)); // 9.0
		System.out.println("arredonda " + valor + " para baixo: " + Math.floor(valor)); // 8.0
	}

}
