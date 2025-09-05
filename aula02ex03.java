package aula;
import java.util.Scanner;

public class aula02ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Qual o valor da compra?:");
     double vlcompra = sc.nextDouble();
     double porcentagem = 10;
     double resultado = vlcompra - ((vlcompra * porcentagem)/100);
     if (vlcompra >= 510.00)
     System.out.println("Você teve 10% de desconto na sua compra, o valor corrigido é: "+ resultado);
     else System.out.println("Sua compra não teve desconto, o valor é: " + vlcompra);
     
     
     
     
     
     sc.close();
	}

}
