package br.com.dio.calculadora;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro número: ");
         a = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("somar " + somar);
        System.out.println("subt " + subtrair);
        System.out.println("mult " + multiplicar);
        System.out.println("dividir " + dividir);



    }
    public static int somar(int a, int b) {
        return a + b;
    }
    public static int subtrair(int a, int b) {
        return a - b;
    }
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    public static int dividir(int a, int b) {
        return a / b;
    }
}
