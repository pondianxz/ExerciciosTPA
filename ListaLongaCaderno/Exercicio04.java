import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c, d, x1, x2;
		
		System.out.println("CALCULADORA DE EQUAÇÃO DE 2º GRAU");
		System.out.println("Insira o valor de A:");
		a = in.nextDouble();
		
		System.out.println("Insira o valor de B:");
		b = in.nextDouble();
		
		System.out.println("Insira o valor de C:");
		c = in.nextDouble();


		d = (b*b)-4*a*c;
		
		if(d<0) { 
			System.out.println("Não há resultado dentro do conjunto de números reais.");
		}else if(d == 0) { 
			
            x1 = (-b + Math.sqrt(d))/2*a;
			
			System.out.println("x = "+x1);
			
		}else { 
			
            x1 = (-b + Math.sqrt(d))/2*a;
            x2 = (-b - Math.sqrt(d))/2*a;
            
            System.out.println("x' = "+x1);
            System.out.println("x'' = "+x2);
		}
		
		in.close();
	}

}
