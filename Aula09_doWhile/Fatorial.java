import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, n, r;
		
		System.out.println("Escreva o numero:");
		n = ler.nextInt();
		r = n;
		i = n;
		
		do {
			r = r*(i-1);
			i--;
		}while (i > 1);
		System.out.println(r);
	
		
		ler.close();
	}

}
