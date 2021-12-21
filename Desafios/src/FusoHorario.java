
import java.util.Scanner;

public class FusoHorario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horasaida = sc.nextInt();
		int tempoviagem = sc.nextInt();
		int fuso = sc.nextInt();
		
		final int completoDia = 24;
	    int ajuste = horasaida + tempoviagem + fuso;
	    
	    if (ajuste >= completoDia) 
	      ajuste -= completoDia;
	    else if (ajuste < 0) 
	      ajuste += completoDia;        
	                    
		
		System.out.println(ajuste);
		
		sc.close();
	}
}
