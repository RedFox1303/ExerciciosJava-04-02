import java.util.Scanner;
public class ExePaga {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		double salB, salL;
		
		System.out.println("Digite teu salário bruto");
		salB=in.nextDouble();
		
		salL = salB + (salB*0.1) - (salB*0.2);
		
		System.out.println("seu salario liquido, com os descontos fica: "+salL);
	}

}
