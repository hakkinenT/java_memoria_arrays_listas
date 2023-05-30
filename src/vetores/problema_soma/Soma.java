package vetores.problema_soma;

import java.util.Locale;
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        int n = sc.nextInt();

        double[] vector = new double[n];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite um número: ");
            vector[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < vector.length; i++) {
            sum += vector[i];
        }

        double avg = sum / n;

        System.out.print("VETORES = ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

        System.out.println();
        System.out.printf("SOMA = %.2f%n", sum);
        System.out.printf("MEDIA = %.2f", avg);

        sc.close();
    }
}
