import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i,n,r,anterior, sucessor;
		r = 1;
		
		System.out.println("Digite um número:");
		n = ler.nextInt();
		anterior = 0;
		
		if(n >= 1) {
			System.out.println("1");
		}else {
			System.out.println("Número inválido.");
		}
		
		
		i=1;
		do {
			sucessor = r+anterior;
			anterior = r;
			r = sucessor;
			System.out.println(r);
			i++;
		}while(i <= n);
		ler.close();
	}

}
