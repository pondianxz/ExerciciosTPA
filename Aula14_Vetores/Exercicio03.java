import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAMANHO = 10;
		int a[], b[], i, j = TAMANHO-1;
		
		a = new int[TAMANHO];
		b = new int[TAMANHO];
		
		for(i=0; i<TAMANHO; i++) {
			System.out.println("Digite o "+(i+1)+"º valor:");
			a[i] = ler.nextInt();
			b[j] = a[i];
			j--;
		}
		
		
		System.out.print("a = [ ");
		for(i=0; i<TAMANHO; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]\n");
		
		System.out.print("b = [ ");
		for(i=0; i<TAMANHO; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
		
		

		
		ler.close();
	}

}
