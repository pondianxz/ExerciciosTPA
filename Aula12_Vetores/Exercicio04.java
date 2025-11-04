import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[],i;
		double media = 0;
		final int TAMANHO = 10;
		a = new int[TAMANHO];
		
		for(i=0; i<TAMANHO; i++) {
			System.out.println("Digite o "+(i+1)+"º valor do vetor:");
			a[i] = ler.nextInt();
			media += a[i];
		}
		
		media /= TAMANHO;
		System.out.println(media);
		
		
		ler.close();
	}

}
