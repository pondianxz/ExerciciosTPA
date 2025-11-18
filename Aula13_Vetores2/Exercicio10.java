import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[], b[],c[], i,j,k=0;
		boolean existe=false;
		final int TAM = 10;
		int tc=TAM;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];

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
                	existe=true;
                    break;
                }
            }

            if(!existe) {
                c[k]=a[i];
                k++;
            }
        }
		
		for(i=0;i<tc;i++) {
			System.out.print(c[i]+" ");
		}

		sc.close();
	}

}
