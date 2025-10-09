import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade, anoNasc, anoAtual;
		
		System.out.println("Insira o seu ano de nascimento:");
		anoNasc = in.nextInt();
		
		System.out.println("Insira o ano atual:");
		anoAtual = in.nextInt();
		
		
		idade = anoAtual - anoNasc;
		
		
		System.out.println("Você tem "+idade+" anos. ");
		
		if(idade < 10) {
			System.out.println("Criança");
		}else if(idade>=10 && idade < 18) {
			System.out.println("Adolescente");
		}else if(idade>=18 && idade < 60) {
			System.out.println("Adulto");
		}else {
			System.out.println("Idoso");
		}
		in.close();
	}

}
