package scaner;
import java.util.Scanner;
// import java.lang.Math;

public class area_circulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();

        double novoSalario = salario * 1.25;

        System.out.println("O novo salário é: " + novoSalario);

        sc.close();

	}

}
