import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a[], b[],i;
		final int TAMANHO =10;
		a = new int[TAMANHO];
		b = new int[TAMANHO];
		
		for(i=0; i<TAMANHO; i++) {
			System.out.println("Digite o "+(i+1)+"º valor do vetor A:");
			a[i] = ler.nextInt();
		}
		
		for(i=0; i<TAMANHO; i++) {
			b[i] = a[i]*a[i];
		}
		
		System.out.print("b = [ ");
		for(i=0; i<TAMANHO; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");

		ler.close();
	}

}
