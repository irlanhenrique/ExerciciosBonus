import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/* Solicite ao usu�rio a digita��o de 2 n�meros inteiros,
		 * nas vari�veis A e B. Sem usar uma terceira vari�vel,
		 *  troque os valores de A e B entre si
		 */
		Scanner leitor = new Scanner(System.in);
		int a,b;
		
		System.out.println("Digite o valor de A");
		a = leitor.nextInt();
		
		System.out.println("Digite o valor de B");
		b = leitor.nextInt();
		
		System.out.println("O Valor de A � : " + a + " e o valor de B � : " + b);
		System.out.println("--------------------------------------------------");
		a = a^b;
		b = b^a;
		a = a^b;
		System.out.println("Trocando o valor de A pelo valor de B, o novo valor de A � : " + a + " e o novo valor de B � : " + b);
		
		leitor.close();
		
	}

}
