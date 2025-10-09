import java.util.Scanner;

public class NumerosPares {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i;
		
		i = 0;
		do {
			System.out.print(i + "  ");
			i+=2;
		}while(i < 501);
		ler.close();
	}
}
