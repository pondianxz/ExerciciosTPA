import java.util.Scanner;

public class MaioreMenor {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
    	double  idade1, idade2, idade3, idade4, idade5, qtdMaior, porcentMaior, porcentMenor;
    	qtdMaior = 0;
    	
    	System.out.println ("Digite a idade 1:");
    	 idade1 = ler. nextDouble (); //leia(idade1)
    	 
    	 System.out.println ("Digite a idade 2:");
    	 idade2 = ler. nextDouble (); //leia(idade2)
    	 
    	 System.out.println ("Digite a idade 3:");
    	 idade3 = ler. nextDouble (); //leia(idade3)
    	 
    	 System.out.println ("Digite a idade 4:");
    	 idade4 = ler. nextDouble (); //leia(idade4)
    	 
    	 System.out.println ("Digite a idade 5:");
    	 idade5 = ler. nextDouble (); //leia(idade5)

    	 if(idade1 >= 18) {
    		 qtdMaior = qtdMaior + 1;
    		 System.out.println ("Aluno 1 é maior de idade");
    	 }else {
    		 System.out.println ("Aluno 1 é menor de idade");
    	 }
    	 if(idade2 >= 18) {
    		 qtdMaior = qtdMaior + 1;
    		 System.out.println ("Aluno 2 é maior de idade");
    	 }else {
    		 System.out.println ("Aluno 2 é menor de idade");
    	 }
    	 if(idade3 >= 18) {
    		 qtdMaior = qtdMaior + 1;
    		 System.out.println ("Aluno 3 é maior de idade");
    	 }else {
    		 System.out.println ("Aluno 3 é menor de idade");
    	 }
    	 if(idade4 >= 18) {
    		 qtdMaior = qtdMaior + 1;
    		 System.out.println ("Aluno 4 é maior de idade");
    	 }else {
    		 System.out.println ("Aluno 4 é menor de idade");
    	 }
    	 if(idade5 >= 18) {
    		 qtdMaior = qtdMaior + 1;
    		 System.out.println ("Aluno 5 é maior de idade");
    	 }else {
    		 System.out.println ("Aluno 5 é menor de idade");
    	 }
    	 
    	 porcentMaior = (qtdMaior/5)*100;
		 System.out.println ("A porcentagem de alunos maiores de idade é "+porcentMaior+"%");
		 
		 porcentMenor = 100 - porcentMaior;
		 System.out.println ("A porcentagem de alunos menores de idade é "+porcentMenor+"%");
			

    		 
         ler.close();
    }
    
}
