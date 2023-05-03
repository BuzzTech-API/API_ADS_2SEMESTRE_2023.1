package javaapplication12;

import java.util.Scanner;

public class JavaApplication12 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Os números digitados foram:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
