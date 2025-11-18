import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[], b[], i, j=0, k=0;
		final int TAM = 20;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º valor do vetor:");
			a[i]=sc.nextInt();
		}

		for(i=0;i<TAM;i++) {
			if(a[i]%2==0) {
				b[j]=a[i];
			}else {
				j--;
			}
			j++;
		}
		
		for(i=0;i<TAM;i++) {
			if(a[i]%2!=0) {
				b[j]=a[i];
				j++;
			}
		}
		
		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+" ");
		}
		
		sc.close();
	}
	
}
