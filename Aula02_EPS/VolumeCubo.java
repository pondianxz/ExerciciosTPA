import java.util.Scanner;

public class VolumeCubo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double l, v;
		
		System.out.println("Digite a medida dos lados:");
		l = ler.nextDouble();
		
		v = l*l*l;
		
		System.out.println("Volume do cubo: " + v);
		ler.close();
	}

}
