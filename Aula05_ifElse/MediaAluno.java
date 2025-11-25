import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n1,n2,n3,n4,mi,nm,ex;
		
		System.out.println("Digite a nota do 1º bimestre:");
		n1 = ler.nextDouble();
		
		System.out.println("Digite a nota do 2º bimestre:");
		n2 = ler.nextDouble();
		
		System.out.println("Digite a nota do 3º bimestre:");
		n3 = ler.nextDouble();
		
		System.out.println("Digite a nota do 4º bimestre:");
		n4 = ler.nextDouble();
		
		mi = (n1+n2+n3+n4)/4;
		System.out.println("Média: "+mi);
		
		if(mi >= 7) {
			System.out.println("Aprovado");
		} else if(mi < 5) {
			System.out.println("Reprovado");
		}else {
			System.out.println("Você está em EXAME. Digite a nota exame:");
			ex = ler.nextDouble();
	
			nm = (mi+ex)/2;
			System.out.println("Nova média: "+nm);
			
			if(nm >= 7) {
				System.out.println("Aprovado (em exame)");
			}else {
				System.out.println("Reprovado");
			}
		}
		
		ler.close();
		
	}

}
