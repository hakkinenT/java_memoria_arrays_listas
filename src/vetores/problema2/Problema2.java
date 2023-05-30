package vetores.problema2;

import vetores.problema2.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] products = new Product[n];

        for(int i = 0; i < products.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            products[i] = new Product(name, price);
        }

        double sum = 0;
        for(Product product : products){
            sum += product.getPrice();
        }

        double avg = sum / products.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();
    }
}
