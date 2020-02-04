import java.util.Arrays;
import java.util.Scanner;

public class ExeCrescente {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a[] = new int[3], i, b[]= new int[3], j;

		for (i = 0; i < 3; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor");
			a[i] = ler.nextInt();
		}

		Arrays.sort(a);
		for (j = 0; j< a.length; j++) {
			b[j] = a[j];
			System.out.println(b[j]+"");
		}
		
	}

}
