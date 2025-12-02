import java.util.Scanner;

public class P1028_Nivel3_Figurinhas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sla;
		int n=sc.nextInt();
		
		int i=0;
		while(i<n) {
			int f1=sc.nextInt();
			int f2=sc.nextInt();
			
			while(f2!=0) {
				sla=f2;
	            f2=f1%f2;
	            f1=sla;
			}
			System.out.println(f1);
			
			i++;
		}
		
		sc.close();
	}

}

