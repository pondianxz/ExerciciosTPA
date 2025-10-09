import java.util.Scanner;

public class ComidaBebida {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double refriL, boloKG;
		int h,m,salgados;
		
		System.out.println("Digite o número de convidados HOMENS:");
		h = ler.nextInt();
		
		System.out.println("Digite o número de convidados MULHERES:");
		m = ler.nextInt();
		
		salgados = (h*10)+(m*6);
		refriL = ((h*600) + (h*800))/1000;
		boloKG = ((h+m)*100)/1000;
		
		System.out.println("Devem ser comprados:");
		System.out.println(salgados+" UNIDADES DE SALGADO");
		System.out.println(refriL+" L  DE REFRIGERANTE");
		System.out.println(boloKG+" kg  DE BOLO");
		ler.close();
	}

}
