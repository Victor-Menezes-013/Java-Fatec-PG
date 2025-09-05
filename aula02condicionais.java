package aula;

public class aula02condicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 18;
		if (idade >= 18) {
			System.out.println(idade);
		    System.out.println("Maior de idade");
		    
		} else {
			System.out.println(idade);
		    System.out.println("Menor de idade");
			}
		
		double nota = 8;
		if (nota >= 9) {
			System.out.println("Excelente");
		} else if(nota >=7) {
			System.out.println("Bom");
		} else if (nota>=5) {
			System.out.println("Regular");
		} else {
			System.out.println("Insuficiente");
		}
			
		}

	}
