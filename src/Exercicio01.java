import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*Para um ano de nascimento fornecido pelo usuário, 
		informe a idade que ele terá no dia 31 de dezembro de 2021*/
		Scanner data = new Scanner(System.in);
		int ano, idade;
		System.out.println("Digite o ano de nascimento");
		
		ano = data.nextInt();
		
		idade = 2021 - ano;
		
		System.out.println("A sua idade em 2021 é de, " + idade +" anos");
		

	}

}
