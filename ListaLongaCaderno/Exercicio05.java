import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c;
		
		System.out.println("Insira o valor A do triângulo:");
		a = in.nextDouble();
		
		System.out.println("Insira o valor B do triângulo:");
		b = in.nextDouble();
		
		System.out.println("Insira o valor C do triângulo:");
		c = in.nextDouble();
		
		
		if(a<b+c && b<a+c && c<a+b) {
			
			if(a == b && b == c) {
				System.out.println("O triângulo é EQUILÁTERO.");
			}else if(a == b || a == c || b == c) {
                System.out.println("O triângulo é ISÓSCELES.");
            }else{
                System.out.println("O triângulo é ESCALENO.");
            }
			
		}else {
			
			System.out.println("Os valores inseridos não são capazes de formar um triângulo.");
			
		}
		in.close();
	}

}
