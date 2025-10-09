import java.util.Scanner;

public class DescontoAVista {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double valor,preco,desconto;
		
		System.out.println("Insira o preço original do produto:");
		preco = ler.nextDouble();
		
		System.out.println("Insira a porcentagem do desconto:");
		desconto = ler.nextDouble();
		
		valor = preco-(desconto/100)*preco;
		System.out.println("Novo valor: R$"+valor);
		ler.close();
		
	}

}
