import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*Um drone de limpeza de ruas deve escolher carregar sempre o lixo de menor peso. 
		 * Entre os pesos de 3 lixos informados pelo usuário, um programa deve indicar 
		 * qual deles deve ser carregado pelo drone.
		 */
		Scanner leitor = new Scanner(System.in);
		double peso1,peso2,peso3;
		
		System.out.println("Digite o 1º peso");
		peso1 = leitor.nextDouble();
		
		System.out.println("Digite o 2º peso");
		peso2 = leitor.nextDouble();
		
		System.out.println("Digite o 3º peso");
		peso3 = leitor.nextDouble();
		
		if(peso1 < peso2) {
			if(peso1 < peso3) {
				System.out.println("O lixo de peso1 é : " + peso1 + " ele é o de menor peso");
			}
		}else if(peso2 < peso3) {
			System.out.println("O lixo de peso2 é : " + peso2 + " ele é o de menor peso");
		}else {
			System.out.println("O lixo de peso3 é : " + peso3 + " ele é o de menor peso");
		}
		leitor.close();
	}
}
