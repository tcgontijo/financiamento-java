import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome;
		double salario;
				
		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO");
		System.out.print("Nome do cliente: ");
		nome = sc.next();
		System.out.print("Salario: ");
		salario = sc.nextDouble();
		
		while (salario < 0) {
			System.out.println("\nO SALARIO DEVE SER MAIOR QUE ZERO!\n");
			System.out.print("Salario: ");
			salario = sc.nextDouble();
		}
		
	}

}
