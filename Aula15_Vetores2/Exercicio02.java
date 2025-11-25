import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[],i,j;
		final int TAM = 5;
		a = new int[TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º valor do vetor:");
			a[i] = sc.nextInt();
		}
		
		for(i=0;i<TAM;i++) {
			
			for(j=1;j<=10;j++) {
				int r=a[i]*j;
				
				System.out.println(a[i]+"x"+j+" = "+r);
			}
			System.out.println();
		}
	}

}
