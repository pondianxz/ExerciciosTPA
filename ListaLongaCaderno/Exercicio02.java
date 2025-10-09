import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double gastoMedio, distancia, capacidade;
		
		System.out.println("Insira a distância percorrida (em km):");
		distancia = in.nextDouble();
		
		System.out.println("Insira a capacidade do tanque de combustível (em litros):");
		capacidade = in.nextDouble();
		
		
		gastoMedio = distancia/capacidade;
		
		System.out.println("Consumo: "+gastoMedio+" km/L");
		if(gastoMedio >= 10) {
			System.out.println("Seu veículo é ECONÔMICO.");
		}else {
			System.out.println("Seu veículo é NÃO ECONÔMICO.");
		}
		
		
		in.close();
	}

}
