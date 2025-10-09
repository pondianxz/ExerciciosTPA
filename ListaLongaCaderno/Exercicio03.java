import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double peso, altura, imc;
		
		System.out.println("Insira seu peso (em KG):");
		peso = in.nextDouble();
		
		System.out.println("Insira sua altura (em metros):");
		altura = in.nextDouble();
		
		
		imc = peso/(altura*altura);
		
		
		System.out.println("Seu IMC é de: "+imc+".");
		System.out.print("Classificação: ");
		if(imc < 18.5) {
			System.out.print("EXCESSO DE MAGREZA");
		}else if(imc >= 18.5 && imc < 25) {
			System.out.print("PESO NORMAL");
		}else if(imc >= 25 && imc < 30) {
			System.out.print("EXCESSO DE PESO");
		}else if(imc >= 30 && imc < 35) {
			System.out.print("OBESIDADE (GRAU I)");
		}else if(imc >= 35 && imc < 40) {
			System.out.print("OBESIDADE (GRAU II)");
		}else {
			System.out.print("OBESIDADE (GRAU III)");
		}
		in.close();
	}

}
