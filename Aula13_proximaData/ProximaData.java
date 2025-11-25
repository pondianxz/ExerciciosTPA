import java.util.Scanner;

public class ProximaData {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int dia, mes, ano,i = 0;
		
		do{
			System.out.println("Digite um dia:");
			dia = ler.nextInt();
			System.out.println("Digite um mês:");
			mes = ler.nextInt();
			System.out.println("Digite um ano:");
			ano = ler.nextInt();
			
			if((dia >= 1 && dia < 32)  &&  (mes >= 1 && mes < 13)) {
				switch(mes) {
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						if(dia==31) {
							dia = 1;
							if (mes==12) {
								mes = 1;
								ano++;
							} else {
								mes++;
							}
						} else {
							dia++;
						}
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						if(dia == 30) {
							dia = 1;
							if (mes==12) {
								mes = 1;
								ano++;
							} else {
								mes++;
							}
						} else {
							dia++;
						}
						break;
					case 2:
						if(ano%4 == 0) {
							if(dia == 29) {
								dia = 1;
								mes++;
							} else {
								dia++;
							}
						}else {
							if(dia == 28) {
								dia = 1;
								mes++;
							} else if(dia <= 27) {
								dia++;
							}else {
								System.out.println("ERRO: Data inválida");
							}
						}
						break;
				}
				
				System.out.println();
				if((dia >= 1 && dia <= 9)  &&  (mes >= 1 && mes <= 9)) {
					System.out.print("0"+dia+"/"+"0"+mes+"/"+ano);
				}else
				if(dia >= 10  &&  (mes >= 1 && mes <= 9)) {
					System.out.print(dia    +"/"+"0"+mes+"/"+ano);
				}else
				if((dia >= 1 && dia <= 9)  &&  mes >=10) {
					System.out.print("0"+dia+"/"+mes+"/"+ano);
				}else
				if(dia >= 10  &&  mes >= 10) {
					System.out.print(dia+"/"+mes+"/"+ano);
				}
				
				
			} else {
				System.out.println("ERRO: Data inválida");
			}
			
			
			System.out.println("\nDeseja continuar?");
			System.out.println("1 = Sim");
			System.out.println("2 = Não");
			i = ler.nextInt();
		} while(i==1);
		
		
		ler.close();
	}

}
