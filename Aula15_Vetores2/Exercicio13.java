import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int TAM = 10;
		int a[], i, j=TAM;
		a = new int[TAM];
		boolean p=false;

		for(i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º valor do vetor:");
			a[i]=sc.nextInt();
		}

		for(i=0;i<TAM;i++) {
			if(a[i]==a[j-1]) {
				p=true;
			}else {
				p=false;
				break;
			}
			j--;
		}
		
		if(p) {
			System.out.println("é palíndromo");
		}else {
			System.out.println("não é palíndromo");
		}

		sc.close();
	}

}
