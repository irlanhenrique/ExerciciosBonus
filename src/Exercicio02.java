import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*Sabendo que cada hora dura 60 minutos e que cada minuto dura 60 segundos, 
		 * solicite ao usu�rio que digite o tempo de um filme em minutos e 
		 * informe a dura��o desse filme em horas e em segundos.
		 */
		Scanner leitor = new Scanner(System.in);
		int tempo,hora,minutos;
		System.out.println("Digite a dura��o do filme em minutos");
		tempo = leitor.nextInt();
		
		hora = tempo / 60;
		minutos = tempo % 60;
		System.out.println("O tempo de dura��o do filme em horas e minutos s�o : Horas " + hora + " Minutos " + minutos);
		
		leitor.close();
	}

}
