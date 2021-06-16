import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/* Uma loja oferece um desconto de 3% aos clientes que tiverem o cupom “DIADEFESTA”. 
		 * Faça um programa onde o funcionário digite o valor da compra e um cupom, informando o valor final a ser pago.
		 */
		Scanner leitor = new Scanner(System.in);
		double valorProduto,valorFinal;
		String cupom;
		
		System.out.println("Digite o valor do produto");
		valorProduto = leitor.nextDouble();
		
		System.out.println("Digite o cupom de desconto");
		cupom = leitor.next();
		
		if(cupom.equals("DIADEFESTA")){
			valorFinal = valorProduto - (valorProduto * 0.03);
			System.out.println("Valor a inicial do produto : " + valorProduto);
			System.out.println("Valor final a ser pago com desconto de 3% : " + valorFinal);
		}else{
			System.out.println("Usuario não digitou cupom de desconto");
			System.out.println("Valor do produto a ser pago : " + valorProduto);
		}
		leitor.close();
		
	}

}
