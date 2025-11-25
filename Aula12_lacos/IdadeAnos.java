import java.util.Scanner;

public class IdadeAnos {

	public static void main(String[] args) {
		int idade,anoAtual, anoNasci, i = 0;
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Digite o ano de nascimentO:");
			anoNasci=ler.nextInt();
			
			System.out.println("Digite o ano atual:");
			anoAtual=ler.nextInt();
			
			idade=anoAtual-anoNasci;
			System.out.println("Sua idade: "+idade);
			System.out.println("Deseja continuar? 1 – continuar / 0 – sair");
			i=ler.nextInt();
			
			if(i!=1 && i!=2) {
				System.out.println("Digite um número válido.");
			}
		}while(i==1);
		ler.close();
	}

}
