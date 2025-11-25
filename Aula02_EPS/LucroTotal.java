import java.util.Scanner;

public class LucroTotal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double precoCusto, quantVendas, precoVenda,lucroTotal;
		
		System.out.println("Digite o preço de custo:");
		precoCusto = ler.nextDouble();
		
		System.out.println("Digite a quantidade de vendas:");
		quantVendas = ler.nextDouble();
		
		System.out.println("Digite o preço de venda:");
		precoVenda = ler.nextDouble();
		
		lucroTotal = precoVenda*(quantVendas - precoCusto);
		System.out.println("Lucro total: R$"+lucroTotal);
		ler.close();
	}

}
