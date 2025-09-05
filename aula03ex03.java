package aula;
import java.util.Scanner;
public class aula03ex03 {
/*3. Validação de Senha (while, if)
Peça ao usuário que digite uma senha (predefinida no código).
    Enquanto a senha estiver incorreta, repita a solicitação.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   int senha;
   do {
   System.out.println("Digite a senha: ");
   senha = sc.nextInt();
   }
   while(senha != 1234) ;
   System.out.println("Parabéns, você acertou a senha!");
	}
}
