import java.util.Scanner;

public class ArrayFillI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int v=sc.nextInt();
		
		int[] n = new int[10];
		n[0]=v;
		for(int i=0; i<n.length; i++) {
			if(i>=1) {
				n[i] = n[i-1]*2;
			}
		}
		
		for(int i=0; i<n.length; i++) {
			System.out.println("N["+i+"] = "+n[i]); 
		}
		
		sc.close();
	}

}

