package aula;
import java.util.Scanner;
public class aula03ex08 {
	/*8. Jogo de Adivinhação (do-while, Math, if)
	O programa escolhe um número aleatório entre 1 e 100.
	    O usuário tenta adivinhar, e o programa responde se está "Acima", "Abaixo" ou "Acertou!".
	    Continue até acertar.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int  ns = (int)(Math.random()*100+1);
    int chute;
    do {
    	System.out.println("Digite um número de 1 a 100");
   	    chute = sc.nextInt();
    	if (chute == ns) {
    		System.out.println("Parabéns, você acertou!!");
    	}else if(chute > ns) {
    		System.out.println("Chutou muito alto!");
    	}else {
    		System.out.println("Chutou muito baixo!");
    	}
    
    
    }while (chute != ns);
    sc.close();
	}

}
