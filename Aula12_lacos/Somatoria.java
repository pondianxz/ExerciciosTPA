public class Somatoria {

	public static void main(String[] args) {
		int i,soma=0;
		
		for(i=0;i<=400;i+=5) {
			System.out.println(i);
			soma+=i;
		}
		System.out.println("Somatória: "+soma);
	}

}
