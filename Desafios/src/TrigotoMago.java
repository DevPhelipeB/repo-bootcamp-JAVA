import java.util.Scanner;

public class TrigotoMago {

	public static void main(String[] args) { 
		
	
		Scanner sc = new Scanner(System.in);
	    int xEntrada = sc.nextInt();
	    final int toKg = 3000;
	    
	    for (int i = 0; i < xEntrada; i++) {
	          int n = sc.nextInt();
	          System.out.println(((long) Math.pow(2, n - 2)) / toKg + " kg");
	    }
			sc.close();

	}

}
