package scaner;
import java.util.Scnner;
// import java.lang.Math;

public class area_circulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double somaNotasPesos = 0;
        double somaPesos = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = sc.nextDouble();

            System.out.print("Digite o peso da nota " + i + ": ");
            double peso = sc.nextDouble();

            somaNotasPesos += nota * peso; 
            somaPesos += peso;             
        }

        double mediaPonderada = somaNotasPesos / somaPesos;

        System.out.println("A média ponderada é: " + mediaPonderada);

        sc.close();

	}

}
