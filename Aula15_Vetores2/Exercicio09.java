import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[], b[], i,j=0,tc=0,k=0;
		final int TAM = 10;
		a = new int[TAM];
		b = new int[TAM];

		for(i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º valor do vetor A:");
			a[i]=sc.nextInt();
		}
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º valor do vetor B:");
			b[i]=sc.nextInt();
		}
		
		for(i=0;i<TAM;i++) {
			for(j=0;j<TAM;j++) {
				if(a[i]==b[j]) {
					tc++;
				}
			}
		}
		
		int c[] = new int[tc];
		
		for(i=0;i<TAM;i++) {
			for(j=0;j<TAM;j++) {
				if(a[i]==b[j]) {
					c[k]=a[i];
					k++;
				}
			}
		}
		
		for(i=0;i<tc;i++) {
			System.out.print(c[i]+" ");
		}
		
		sc.close();
	}

}
