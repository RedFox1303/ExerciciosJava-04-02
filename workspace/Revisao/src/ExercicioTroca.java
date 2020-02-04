import java.util.Scanner;
public class ExercicioTroca {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int x,y,edson = 0;
		
		System.out.println("Digite o primeiro valor: ");
		x=ler.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		y=ler.nextInt();
		
		edson=y;
		y=x;
		x=edson;
		
		System.out.println(x);
		System.out.println(y);

		
		
		

	}

}
