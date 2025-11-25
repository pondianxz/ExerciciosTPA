import java.util.Scanner;

public class Altura {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double joao, pedro;
		int i;
		
		joao = 1.34;
		pedro = 1.45;
		
		i=0;
		do {
			joao = joao+0.025;
			pedro = pedro+0.02;
			i++;
		}while(joao < pedro);
		System.out.println("Nº de anos que vai demorar até João ultrapassar Pedro: "+i);
		ler.close();
	}

}
