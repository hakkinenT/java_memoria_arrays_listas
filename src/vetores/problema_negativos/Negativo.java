package vetores.problema_negativos;


import java.util.Scanner;

public class Negativo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        int n = sc.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite um número: ");
            vector[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS: ");
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] < 0){
                System.out.println(vector[i]);
            }
        }

        sc.close();
    }
}
