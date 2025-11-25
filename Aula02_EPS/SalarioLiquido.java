import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salBruto, salLiquido,inss,valeTrans;
		
		System.out.println("Digite o salário bruto:");
		salBruto = ler.nextDouble();
		
		inss = salBruto*8/100;
		valeTrans = salBruto*6/100;
		salLiquido = salBruto-(inss+valeTrans);
		
		System.out.println("Seu salário líquido é de R$"+salLiquido);
		ler.close();

	}

}
