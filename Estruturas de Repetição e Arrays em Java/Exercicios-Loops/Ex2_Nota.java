import java.util.Scanner;

public class Ex2_Nota {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		int nota;
		
		System.out.println("Nota: ");
		nota = scan.nextInt();
		
		while(nota < 0 || nota > 10 ) {
				System.out.println("Nota N�o suportada! Por favor, Nota de 0 a 10");
				System.out.println("Digite Novamente: ");
				nota = scan.nextInt();	
		}
	}
}
