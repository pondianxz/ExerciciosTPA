import java.util.Scanner;

public class MetrosParaKm {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double x, resultado;
		
		System.out.println("Digite uma quantidade de metros:");
		x = ler.nextDouble();
		resultado = x/1000;
		
		System.out.println("Seu número em quilômetros é igual a: "+resultado+"km.");
		ler.close();
	}

}
