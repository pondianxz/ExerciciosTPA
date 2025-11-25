import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[], b[], i,j;
		final int TAM = 10;
		a = new int[TAM];
		b = new int[TAM];

		for(i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º valor do vetor:");
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<TAM;i++) {
			int s=0;
			for(j=i;j<TAM;j++) {
				s+=a[j];
			}
			b[i]=s;
		}

		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+" ");
		}

		sc.close();
	}

}
