package dev.ofiucoder.java_excercise_loop;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();
            printMultiplicattionTable(numero);
        }
    }

    public static void printMultiplicattionTable(int numero) {
        System.out.println("Tabla de Multiplicar del " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

}