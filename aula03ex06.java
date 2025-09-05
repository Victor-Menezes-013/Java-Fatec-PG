package aula;
import java.util.Scanner;
public class aula03ex06 {
/*6. Média de Notas
Leia várias notas entre 0 e 10 usando while, até o usuário digitar "-1".
    Calcule e exiba a média das notas válidas.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     double nota = 0, soma = 0;
     int c = 0;
     while(nota != -1) {
     System.out.println("Digite a nota do aluno:");
     nota = sc.nextDouble();
     if (nota >= 0 && nota <=10)
    	 soma += nota;
     c +=1;
     }
     double media = (soma/c);
     System.out.println(media);
	}

}
