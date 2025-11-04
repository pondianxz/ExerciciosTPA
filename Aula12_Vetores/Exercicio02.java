import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a[], b[], c[], i;
		final int TAMANHO = 10;
		a = new int[TAMANHO];
		b = new int[TAMANHO];
		c = new int[TAMANHO];
		
		for(i=0; i<TAMANHO; i++) {
			System.out.println("Digite o "+(i+1)+"º valor do vetor A:");
			a[i] = ler.nextInt();
		}
		
		for(i=0; i<TAMANHO; i++) {
			System.out.println("Digite o "+(i+1)+"º valor do vetor B:");
			b[i] = ler.nextInt();
			c[i] = a[i]+b[i];
		}

		
		System.out.print("c = [ ");
		for(i=0; i<TAMANHO; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.print("]");
		
		
		ler.close();
	}

}
