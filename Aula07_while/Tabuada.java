import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i,n,r;

		System.out.println("Insira um número:");
		n = ler.nextInt();
		
		
		i = 1;
		while(i <=10) {
			r = n*i;
			System.out.println(n+"x"+i+" ="+r);
			i++;
		}
		ler.close();
	}

}
