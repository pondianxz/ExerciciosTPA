import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		//testar se a senha existe, e se ela ja foi usada
		//         45 27 75 32 84 10 64 66 62 46
		//usadas = 45 -1 -1 -1 -1 -1 -1 -1 -1 -1
		Scanner sc = new Scanner(System.in);
		int a[], u[], nUsadas=0,i,j=0;
		final int TAM = 10;
		a = new int[TAM];
		u = new int[TAM];
		
		for(i=0;i<TAM;i++) {
			a[i]=(int)(Math.random()*100);
			u[i]=-1;
		}
		
		while(j<2) {
			boolean ex=false;
			
			for(i=0;i<TAM;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();

			int s=sc.nextInt();
			
			for(i=0;i<TAM;i++) {
				if(a[i]==s) {
					ex=true;
					break;
				}
			}
			
			if(ex) {
				for(i=0;i<TAM;i++) {
					if(u[i]==s) {
						System.out.println("Nao vai repetir");
						break;
					}else if(u[i]!=s && i==TAM-1) {
						System.out.println("Vai la comer amigao");
						u[nUsadas]=s;
						nUsadas++;
						break;
					}
				}				
			}else {
				System.out.println("A senha nao existe");
			}
			j++;
		}
		
	}

}
