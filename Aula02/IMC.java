import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double peso, altura,imc;
		
		System.out.println("Digite o seu peso:");
		peso = ler.nextDouble();
		
		System.out.println("Digite sua altura:");
		altura = ler.nextDouble();
		
		imc = peso/(altura*altura);
		
		System.out.println("Seu IMC é: "+imc);
		ler.close();
	}

}
