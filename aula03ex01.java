package aula;
import java.util.Scanner;

public class aula03ex01 {
/*1. Calculadora Simples: 
Crie um programa que leia dois números e um operador ("+", "-", "*", "/") e use um switch para exibir o resultado da operação.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Digite um número: ");
     double n1 = sc.nextDouble();
     System.out.println("Digite outro número: ");
     double n2 = sc.nextDouble();
     System.out.println("Escolha a operação sendo: 1 = +, 2 = -, 3 = *, 4 = /");
     int op = sc.nextInt();
     switch(op) {
     case 1: 
    	 System.out.println("A opção 1 foi escolhida: a soma de "+n1+" e "+n2+" é: "+(n1+n2));
    	 break;
     case 2:	
    	 System.out.println("A opção 2 foi escolhida: a subtração de "+n1+" e "+n2+" é: "+(n1-n2));
    	 break;
     case 3:
    	 System.out.println("A opção 3 foi escolhida: a multiplicação de "+n1+" e "+n2+"é: "+(n1*n2));
    	 break;
     case 4:
    	 if (n2 != 0) {
             System.out.println("A opção 4 foi escolhida: a divisão de " + n1 + " e " + n2 + " é: " + (n1 / n2));
         } else {
             System.out.println("Erro: divisão por zero!");
         }
    	 break;
     default:
    	 System.out.println("Opção inválida!");
  
     }
     
     sc.close();
     
	}

}
