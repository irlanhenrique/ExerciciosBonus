import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/* Solicite ao usuário a digitação de 2 números inteiros,
		 * nas variáveis A e B. Sem usar uma terceira variável,
		 *  troque os valores de A e B entre si
		 */
		Scanner leitor = new Scanner(System.in);
		int a,b;
		
		System.out.println("Digite o valor de A");
		a = leitor.nextInt();
		
		System.out.println("Digite o valor de B");
		b = leitor.nextInt();
		
		System.out.println("O Valor de A é : " + a + " e o valor de B é : " + b);
		System.out.println("--------------------------------------------------");
		a = a^b;
		b = b^a;
		a = a^b;
		System.out.println("Trocando o valor de A pelo valor de B, o novo valor de A é : " + a + " e o novo valor de B é : " + b);
		
		leitor.close();
		
	}

}
