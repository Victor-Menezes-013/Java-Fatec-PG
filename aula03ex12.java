package aula;
import java.util.Scanner;
public class aula03ex12 {
/*12. Conversor de Temperatura
Peça ao usuário uma temperatura em Celsius, e ofereça opções:
    1: Converter para Fahrenheit
    2: Converter para Kelvin*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println("Digite uma temperatura em °C: ");
  double c = sc.nextDouble();
  System.out.println("1- Converter para Fahrenheit");
  System.out.println("2- Converter para Kelvin");
  int o = sc.nextInt();
  switch(o) {
  case 1:
	  double f = (c * 1.8) + 32; 
		System.out.println("A temperatura convertida é: "+f+"°F");
		break;
	case 2:
		double k = c + 273.15;
		System.out.println("A temperatura convertida é: "+k+"K");
		break;
	default:
		System.out.println("Opção inválida!");
  }
  sc.close();
  }

}
