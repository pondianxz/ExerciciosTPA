import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double salario, aliquota, parcela, irpf;
		
		System.out.println("Insira o salário:");
		salario = in.nextDouble();
		
		if(salario <= 1434.59) {
			aliquota = 0;
			parcela = 0;
			
		}else if(salario >= 1434.60 && salario <= 2150) {
			aliquota = 7.5;
			parcela = 107.59;
			
		}else if(salario >= 2150.01 && salario <= 2866.70) {
			aliquota = 15;
			parcela = 268.84;
			
		}else if(salario >= 2866.71 && salario <= 3582) {
			aliquota = 22.5;
			parcela = 483.84;
			
		}else {
			aliquota = 27.5;
			parcela = 662.94;
			
		}
		
		irpf = salario*aliquota/100 - parcela;
		System.out.println("Seu desconto do IRPF é de R$"+irpf);
		in.close();
	}

}
