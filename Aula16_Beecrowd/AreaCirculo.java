import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = 3.14159;
		double r=sc.nextDouble();
		double a = n*(r*r);
		System.out.printf("A=%.4f%n",a);
		
	    sc.close();
	}

}

