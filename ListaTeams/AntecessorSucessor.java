import java.util.Scanner;

public class AntecessorSucessor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, antecessor, sucessor;
		
		System.out.println("Leia o valor:");
		n1 = ler.nextInt();
		
		antecessor = n1-1;
		sucessor = n1+1;
		
		System.out.println("Antecessor: "+antecessor);
		System.out.println("Sucessor: "+sucessor);
		ler.close();
	}

}
