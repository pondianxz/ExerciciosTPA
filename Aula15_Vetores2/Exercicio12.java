import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		//         45 27 75 32 84 10 64 66 62 46
		//usadas = -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
		Scanner sc = new Scanner(System.in);
		int a[], u[], nUsadas=0,i;
		final int TAM = 10;
		a = new int[TAM];
		
		// cria um vetor de senhas usadas
		u = new int[TAM];
		
		for(i=0;i<TAM;i++) {
			a[i]=(int)(Math.random()*100);
			
			/* coloca -1 em todos os valores (pq a senha pode ir de 0 a 100,
			 * e se fosse 0, pode ser que daria uma confusao na hora de verificar) */
			u[i]=-1;
		}
		
		while(true) {
			boolean ex=false;
			
			for(i=0;i<TAM;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
			
			int s=sc.nextInt();
			
			//  itera por todos os elementos do vetor, pra ver se a senha realmente existe
			for(i=0;i<TAM;i++) {
				if(a[i]==s) {
					ex=true;
				}
			}
			
			if(ex) {
				for(i=0;i<TAM;i++) {
					// se a senha existe no vetor de senhas usadas entao nao deixa ele comer mais, e sai do loop
					if(u[i]==s) {
						System.out.println("Nao vai repetir");
						break;
					}
					/* senao, se iterou por todos os elementos do vetor (i==TAM-1), e nao encontrou a senha
					 * na lista de usadas, significa que a senha é válida. Então ele adiciona a senha no
					 * vetor de senhas usadas. */
					else if(u[i]!=s && i==TAM-1) {
						System.out.println("Vai la comer amigao");
						u[nUsadas]=s;
						nUsadas++;
						break;
					}
				}				
			}else {
				System.out.println("A senha nao existe");
			}
		}
		
	}

}
