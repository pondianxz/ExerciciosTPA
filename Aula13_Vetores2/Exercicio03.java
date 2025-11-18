import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[], i, j;
		final int TAM = 10;
		a = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor do vetor:");
			a[i] = sc.nextInt();
		}
		
		System.out.print("[");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]);
			if(i != TAM-1) {
				System.out.print(",  ");
			}
		}
		System.out.print("]\n");
		
		for(i=0; i<TAM; i++) {
			boolean primo = true;
			
			if(a[i] == 1) {
				primo = false;
			}
			
			for(j=2; j<a[i]; j++) {
				if(a[i]%j == 0) {
					primo = false;
					break;
				}
			}
			
			if(primo) {
				System.out.print("PRIMO");
			}else {
				System.out.print("NAO");
			}
			if(i != TAM-1) {
				System.out.print(",  ");
			}
		}
		
		sc.close();
		
	}

}
