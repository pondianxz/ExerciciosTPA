import java.util.Scanner;

public class IdadeUsuario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, maiorIdade, menorIdade, i;
		maiorIdade = 0;
		menorIdade = 0;
		
		i=1;
		while(i<=5) {
			System.out.println("Digite uma idade:");
			idade = ler.nextInt();
			
			if(idade >= 18) {
				maiorIdade++;
			}else {
				menorIdade++;
			}
			i++;
		}
		
		System.out.println("=== RESULTADOS ===");
		System.out.println(maiorIdade+" são maiores de idade");
		System.out.println(menorIdade+" são menores de idade");
		ler.close();
	}

}
