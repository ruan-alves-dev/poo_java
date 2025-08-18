package scaner;
import java.util.Scanner;
// import java.lang.Math;

public class area_circulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        double soma = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double numero = sc.nextInt();
            soma += numero;
        }

        double media = soma/3;
        System.out.println("A média: " + media);

        sc.close();

	}

}
