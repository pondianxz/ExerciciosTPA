import java.util.Scanner;

public class NumeroPlaca {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int ultimoN;
		
		System.out.println("Digite o útlimo número da placa de seu veículo:");
		ultimoN = ler.nextInt();
		
		switch(ultimoN) {
			case 1:
			case 2:
				System.out.println("O seu veículo não pode circular na SEGUNDA-FEIRA.");
				break;
			case 3:
			case 4:
				System.out.println("O seu veículo não pode circular na TERÇA-FEIRA.");
				break;
			case 5:
			case 6:
				System.out.println("O seu veículo não pode circular na QUARTA-FEIRA.");
				break;
			case 7:
			case 8:
				System.out.println("O seu veículo não pode circular na QUINTA-FEIRA.");
				break;
			case 9:
			case 0:
				System.out.println("O seu veículo não pode circular na SEXTA-FEIRA.");
				break;
			default:
				System.out.println("Número de placa inválido.");
		}
		ler.close();
	}

}
