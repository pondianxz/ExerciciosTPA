import java.util.Scanner;

public class NovoValor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double preco,valorNovoPix,valorNovoCC;
		
		System.out.println("Digite o preço do produto:");
		preco = ler.nextDouble();
		
		valorNovoPix = preco-(preco*10/100);
		valorNovoCC = preco+(preco*5/100);
		
		System.out.println("Valor novo (PIX):               R$"+valorNovoPix);
		System.out.println("Valor novo (Cartão de crédito): R$"+valorNovoCC);
		ler.close();
	}

}
