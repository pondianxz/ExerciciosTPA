import java.util.Scanner;

public class Expoente {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, b, r, expo;

		System.out.println("Leia a base:");
		b = ler.nextInt();
		
		System.out.println("Leia o expoente:");
		expo = ler.nextInt();
		
		r = b;
		i = 1;
		
		do {
			r = r*b;
			i++;
		}while(i < expo);
		System.out.println("Resultado: "+ r);
		ler.close();
	}

}
