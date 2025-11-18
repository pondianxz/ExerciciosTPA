import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[], b[], i, j;
		final int TAM = 15;
		a = new int[TAM];
		b = new int[TAM];

		for(i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º valor do vetor:");
			a[i]=sc.nextInt();
		}

		for(i=0;i<TAM;i++) {
			j=a[i];
			b[i]=a[i];
			
			while(j>1) {
				b[i]*=j-1;
				j--;
			}
		}

		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+" ");
		}

		
	}

}
