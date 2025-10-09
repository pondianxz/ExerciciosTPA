import java.util.Scanner;

public class VolumeLataOleo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double r, h, v, pi;
		pi = 3.14;
		
		System.out.println("Digite o raio: ");
		r = ler.nextDouble();
		
		System.out.println("Digite a altura:");
		h = ler.nextDouble();
		
		
		v = pi*r*r*h;
		System.out.println("Volume: "+v);
		
		ler.close();
	}

}
