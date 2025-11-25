import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[], i;
		final int TAM = 10;
		a = new int[TAM];
		boolean ta=false;

		for(i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º valor do vetor:");
			a[i]=sc.nextInt();
		}

		System.out.println("Valor a procurar:");
		int x=sc.nextInt();
		
		for(i=0;i<TAM;i++) {
			if(x==a[i]) {
				ta=true;
			}
		}
		
		if(ta) {
			System.out.println("Esse elemento existe");
		}else {
			System.out.println("Esse elemento não existe");
		}
		
		sc.close();
	}

}
