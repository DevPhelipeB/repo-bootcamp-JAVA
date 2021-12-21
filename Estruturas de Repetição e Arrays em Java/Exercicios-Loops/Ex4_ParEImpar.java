import java.util.Scanner;


public class Ex4_ParEImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int qtdNumeros, numero; 
		int qtdPares = 0, qtdImpares = 0;
		
		
		
		System.out.println("Quantidade de números: ");
		qtdNumeros = scan.nextInt();
		
		
		int count = 0;
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			if (numero % 2 == 0) qtdPares++;
			else qtdImpares++;
			
			
			count++;
		} while(count < qtdNumeros);
		
		
		System.out.println("Quantidade Par: " + qtdPares);
		System.out.println("Quantidade Impar: " + qtdImpares);

	}

}
