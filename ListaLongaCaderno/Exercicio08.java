import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n1, n2, ne, media, novaMedia;
		
		System.out.println("Insira a nota 1:");
		n1 = in.nextDouble();
		
		System.out.println("Insira a nota 2:");
		n2 = in.nextDouble();
		
		media = n1+n2/2;
		
		if(media < 3) {
			System.out.println("Reprovado");
		}else if (media >= 6) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Você está em exame.");
			System.out.println("Insira a nota de exame:");
			ne = in.nextDouble();
			
			novaMedia = n1+n2+ne/3;
			
			if(novaMedia >= 6) {
				System.out.println("Aprovado");
			}else {
				System.out.println("Reprovado");
			}
		}
		in.close();
	}

}
