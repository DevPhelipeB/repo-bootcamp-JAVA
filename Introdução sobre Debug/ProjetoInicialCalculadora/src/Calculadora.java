
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro n�mero: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		float divisao = divisao(a,b);
		int multiplicacao = multiplicacao(a,b);
		
		System.out.println("soma resultou: " + soma);
		System.out.println("subtracao resultou: " + subtracao);
		System.out.println("divisao resultou: " + divisao);
		System.out.println("multiplicacao resultou: " + multiplicacao);
	}
	
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtracao(int a, int b) {
		return a - b;
	}
	
	public static float divisao(float a, float b) {
		return a / b;
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
	}

}
