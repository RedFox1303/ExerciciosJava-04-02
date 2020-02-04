import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int primo, i, j= 0 ;

		System.out.println("Digite um número");
		primo = ler.nextInt();

		for (i = 1; i<=primo; i++) {
			
			if (primo % i == 0) {
				j= j+1;
			}
		}
		if (j==2) {
			System.out.println("o numero é primo");
		} else {
			System.out.println("o numero nao é primo");
		}
		
	}

}
