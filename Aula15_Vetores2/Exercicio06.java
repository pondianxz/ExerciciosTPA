
public class Exercicio06 {

	public static void main(String[] args) {
		int a[], i,t=1;
		final int TAM = 11;
		a = new int[TAM];
		
		for(i=0;i<TAM;i++) {
			a[i]=t;
			t=2*t;
		}
		
		for(i=0;i<TAM;i++) {
			System.out.println(a[i]);
		}
	}

}
