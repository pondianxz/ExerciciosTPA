import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c, maior, meio, menor;
		
		System.out.println("Insira o valor de A:");
		a = in.nextDouble();
		
		System.out.println("Insira o valor de B:");
		b = in.nextDouble();
		
		System.out.println("Insira o valor de C:");
		c = in.nextDouble();
		
		/* TODAS AS COMBINAÇÕES
		  a>b>c
		  a>c>b
		  b>a>c
		  b>c>a
		  c>a>b
		  c>b>a
		*/
		
		if(a>b && b>c) { // a>b>c
			maior = a;
			meio = b;
			menor = c;
			
		}else if(a>c && c>b) { // a>c>b
			maior = a;
			meio = c;
			menor = b;
		
		}else if(b>a && a>c) { // b>a>c
			maior = b;
			meio = a;
			menor = c;
			
		}else if(b>c && c>a) { // b>c>a
			maior = b;
			meio = c;
			menor = a;
			
		}else if(c>a && a>b) { // c>a>b
			maior = c;
			meio = a;
			menor = b;
		}else { // c>b>a
			maior = c;
			meio = b;
			menor = a;
		}
		
		System.out.println("Ordem crescente dos valores:");
		System.out.println(menor);
		System.out.println(meio);
		System.out.println(maior);
		
		in.close();
		
	}

}
