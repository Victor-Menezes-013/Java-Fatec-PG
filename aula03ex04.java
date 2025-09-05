package aula;
import java.util.Scanner;

public class aula03ex04 {
/*4. Menu com Do-While e Switch
Exiba um menu como abaixo:
    1 - Somar dois números  
    2 - Subtrair dois números  
    3 - Multiplicar dois números  
    4 - Dividir dois números  
    0 - Sair*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite outro número: ");
        double n2 = sc.nextDouble();
        
        int op;
        do {
            System.out.println("   1 - Somar os números  \r\n"
                             + "   2 - Subtrair os números  \r\n"
                             + "   3 - Multiplicar os números  \r\n"
                             + "   4 - Dividir os números  \r\n"
                             + "   0 - Sair");
            
            op = sc.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("1 - Somar os números: " + n1 + " e " + n2 + " é: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("2 - Subtrair os números: " + n1 + " e " + n2 + " é: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("3 - Multiplicar os números: " + n1 + " e " + n2 + " é: " + (n1 * n2));
                    break;
                case 4:
                    if (n2 != 0) {
                        System.out.println("4 - Dividir os números: " + n1 + " e " + n2 + " é: " + (n1 / n2));
                    } else {
                        System.out.println("Erro: divisão por zero!");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            
        } while (op != 0);
        
        sc.close();
    }
}
