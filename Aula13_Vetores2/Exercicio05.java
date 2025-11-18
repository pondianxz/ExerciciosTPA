import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[], i, j;
		final int TAM = 10;
		a = new int[TAM];

		for(i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º valor do vetor:");
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<TAM;i++) {
			for(j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
