import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n1, n2, m;
		
		System.out.println("Digite a 1ª nota:");
		n1 = ler.nextDouble();
		
		System.out.println("Digite a 2ª nota:");
		n2 = ler.nextDouble();
		
		m = (n1+n2)/2;
		
		System.out.println("A média é: "+m);
		
		if(m < 4) {
			System.out.println("Reprovado");
		}else if(m < 6) {
			System.out.println("Recuperação");
		}else {
			System.out.println("Aprovado");
		}
		ler.close();
	}

}
