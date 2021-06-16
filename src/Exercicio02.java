import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*Sabendo que cada hora dura 60 minutos e que cada minuto dura 60 segundos, 
		 * solicite ao usuário que digite o tempo de um filme em minutos e 
		 * informe a duração desse filme em horas e em segundos.
		 */
		Scanner leitor = new Scanner(System.in);
		int tempo,hora,minutos,segundos;
		System.out.println("Digite a duração do filme em minutos");
		tempo = leitor.nextInt();
		
		hora = tempo / 60;
		minutos = tempo % 60;
		segundos = tempo * 60;
		System.out.println("O tempo de duração do filme é " + hora + "Hs " + " e " + minutos + "min" +
		" e total em segundos " + segundos + "s");
		
		leitor.close();
	}

}
