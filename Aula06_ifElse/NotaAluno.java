import java.util.Scanner;

public class NotaAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double n1,n2,n3,n4,mi,nm,ex;
		
		System.out.println("Digite a primeira nota:");
		n1=sc.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		n2=sc.nextDouble();
		
		System.out.println("Digite a terceira nota:");
		n3=sc.nextDouble();
		
		System.out.println("Digite a quarta nota:");
		n4=sc.nextDouble();
		
		mi=(n1+n2+n3+n4)/4;
		
		System.out.println("Média inicial: "+mi);
		
		if(mi>=7) {
			System.out.println("APROVADO");
		}else if(mi<5) {
			System.out.println("REPROVADO");
		}else {
			System.out.println("Você está em exame");
			System.out.println("Digite a nota de exame:");
			ex=sc.nextDouble();
			
			nm=(mi+ex)/2;
			
			System.out.println("Nova média: "+nm);
			if(nm>=7) {
				System.out.println("APROVADO EM EXAME");
			}else {
				System.out.println("REPROVADO");
			}
		}
		
		sc.close();
	}

}
