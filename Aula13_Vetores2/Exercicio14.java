import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[],b[], i;
		final int TAM = 10;
		a = new int[TAM];
		b = new int[TAM];

		for(i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º valor do vetor:");
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<TAM;i++) {
			if(a[i]%2==0) {
				b[i]=1;
			}else {
				b[i]=0;
			}
		}
		
		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+" ");
		}

		sc.close();
	}

}
