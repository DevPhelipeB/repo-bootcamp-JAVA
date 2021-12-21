import java.io.IOException;
import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	
    	for (int i = 0; i < N; i++) {
    		
    		int x = leitor.nextInt();
    		final	int divisor = 2;
    	  
    		if (x == 0) 
    		  System.out.println("NULL");
    		else if (x % divisor == 0 && x > 0) 
    		  System.out.println("EVEN POSITIVE");
    		else if (x % divisor == 0 && x < 0) 
    		  System.out.println("EVEN NEGATIVE");
    		else if (x % divisor != 0 && x > 0) 
    		  System.out.println("ODD POSITIVE");
    		else
    		  System.out.println("ODD NEGATIVE");
    	}
 	}
}