import java.util.Scanner;
public class ExercicioReajuste {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	
		double salB, salL;
		
		System.out.println("digite o valor do salario:");
		salB =in.nextDouble();
		
		salL = salB + (salB * 0.15);
		
		System.out.println("o salario liquido é: "+salL);
		
	}

}
