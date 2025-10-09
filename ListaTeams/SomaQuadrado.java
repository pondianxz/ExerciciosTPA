import java.util.Scanner;

public class SomaQuadrado {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3, resultado;
		
		System.out.println("Leia o primeiro número:");
		n1 = ler.nextInt();
		
		System.out.println("Leia o segundo número:");
		n2 = ler.nextInt();
		
		System.out.println("Leia o terceiro número:");
		n3 = ler.nextInt();
		
		resultado = n1*n1 + n2*n2 + n3*n3;
		
		System.out.println("Resultado: "+resultado);
		ler.close();
	}

}
