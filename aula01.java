package aula;

public class aula01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Tudo é comentário para o programa
		 */
		String nome = "Victor";
		String sobrenome = "Menezes";
		int IDADE = 26;
		System.out.println("Boa noite, " + nome + "! Você tem " + IDADE + " anos de idade");
		System.out.println("2º Ciclo");
		System.out.printf("Boa noite, %s!%nVocê tem %d anos de idade!%n%n", nome, IDADE);
		//System.out.printf -> permite a formatação do resultado exibido
		// %s -> variável do tipo string
		// %n -> nova linha
		// %d -> variável do tipo inteiro
		// %.2f -> variável do tipo float/double, formatado com 2 casas
		// Método concat() - concatena variáveis
		String mensagem = nome.concat(sobrenome);
		//String mensagem = nome.concat(" ").concat(sobrenome);
		System.out.println("Olá, " + mensagem);
		// Método length() - retorna o tamanho da String
		System.out.println(nome.length());
		// Método toUpperCase() ou toLowerCase() - converte para maiúsculas ou minúsculas
		System.out.println(nome.toUpperCase());
		System.out.println(nome.toLowerCase());
		// Método charAt(int índice) - retorna o caracter em uma posição
		System.out.println(nome.charAt(0));
		// Método substring(início, fim) - retorna parte da String
		System.out.println(nome.substring(0,3));
		// Método equals() - compara String
		// Método equalsIgnoreCase() - compara String ignorando letras maiúsculas / minúsculas
		System.out.println("victor".equals("victor"));
		System.out.println(nome.equals("victor")); //Victor
		System.out.println(nome.equalsIgnoreCase("vicTor"));
		// Método contains() - verifica se um trecho está dentro da String
		System.out.println(nome.contains("ri"));
		// Método replace() - substitui caracteres ou trecho dentro da String
		System.out.println(nome.replace("i", "a"));
	}

}