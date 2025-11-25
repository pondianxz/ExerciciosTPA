import java.util.Scanner;

public class IdadesAlunos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double pctMaior,pctMenor;
		int maior=0,menor=0, idd1, idd2, idd3, idd4, idd5;
		
		System.out.println("Digite a 1ª idade:");
		idd1=sc.nextInt();
		
		System.out.println("Digite a 2ª idade:");
		idd2=sc.nextInt();
		
		System.out.println("Digite a 3ª idade:");
		idd3=sc.nextInt();
		
		System.out.println("Digite a 4ª idade:");
		idd4=sc.nextInt();
		
		System.out.println("Digite a 5ª idade:");
		idd5=sc.nextInt();
		
		if(idd1>=18) {
			maior++;
		}else {
			menor++;
		}
		
		if(idd2>=18) {
			maior++;
		}else {
			menor++;
		}
		
		if(idd3>=18) {
			maior++;
		}else {
			menor++;
		}
		
		if(idd4>=18) {
			maior++;
		}else {
			menor++;
		}
		
		if(idd5>=18) {
			maior++;
		}else {
			menor++;
		}
		
		pctMaior=(maior*100)/5;
		pctMenor=(menor*100)/5;
		
		System.out.println("Alunos maiores de idade: "+maior);
		System.out.println("Alunos menores de idade: "+menor);
		System.out.println("Porcentagem de maiores de idade: "+pctMaior+"%");
		System.out.println("Porcentagem de menores de idade: "+pctMenor+"%");
		
		sc.close();
	}

}
