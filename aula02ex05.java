package aula;
import java.util.Scanner;
public class aula02ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
 System.out.println("Digite o primeiro número: ");
 double n1 = sc.nextDouble();
 System.out.println("Digite o segundo número: ");
 double n2 = sc.nextDouble();
 System.out.println("Digite o operador sendo (A = +), (B = -), (C = *), (D = /) ");
 char o = sc.next().charAt(0);
 if (o == 'a')
	 System.out.println("O resultado da operação de "+n1+" + "+n2+" é: "+(n1+n2));
 else if (o=='b')
	 System.out.println("O resultado da operação de "+n1+" - "+n2+" é: "+(n1-n2));
 else if (o== 'c')
	 System.out.println("O resultado da operação de "+n1+" * "+n2+" é: "+(n1*n2));
 else if (o=='d')
	 System.out.println("O resultado da operação de "+n1+" / "+n2+" é: "+(n1/n2));
 sc.close();
	}

}
