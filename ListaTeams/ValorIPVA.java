import java.util.Scanner;

public class ValorIPVA {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double veiculo, ipva;
		
		System.out.println("Digite o valor do veículo:");
		veiculo = ler.nextDouble();
		
		ipva = veiculo/100*4;
		System.out.println("Valor do IPVA: R$"+ipva);
		ler.close();
	}

}
