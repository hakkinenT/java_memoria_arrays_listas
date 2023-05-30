package matrizes.problema2;

import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // linhas
        int n = sc.nextInt(); // colunas

        int[][] matriz = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int num = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matriz[i][j] == num){
                    System.out.println("Position " + i + ", " + j + ":");

                    if(j != 0){
                        System.out.println("Left: " + matriz[i][j-1]);
                    }

                    if(j != n-1){
                        System.out.println("Right: " + matriz[i][j+1]);
                    }

                    if(i != 0){
                        System.out.println("Up: " + matriz[i-1][j]);
                    }

                    if(i != m-1){
                        System.out.println("Down: " + matriz[i+1][j]);
                    }


                }
            }
        }

        sc.close();
    }
}
