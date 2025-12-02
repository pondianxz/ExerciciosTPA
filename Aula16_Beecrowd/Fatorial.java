import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, r;
		
		int n = sc.nextInt();
		r = n;
		i = n;
		
		do {
			r = r*(i-1);
			i--;
		}while (i > 1);
		System.out.println(r);
	
		
		sc.close();
	}

}

