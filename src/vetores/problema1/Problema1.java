package vetores.problema1;

import java.util.Locale;
import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for(int i = 0; i < vetor.length;i++){
            sum += vetor[i];
        }

        double avg = sum/n;

        System.out.printf("AVERAGE HEIGHT %.2f%n", avg);

        sc.close();
    }
}
