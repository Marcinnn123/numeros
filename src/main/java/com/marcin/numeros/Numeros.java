package com.marcin.numeros;

public class Numeros {

    public static void main(String[] args) {

        int n = 21;
        long[] fib = new long[n];

        fib[0] = 0;
        fib[1] = 1;

        long sum = fib[0] + fib[1];

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            sum += fib[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fib[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        //mean
        double mean = (double) sum / n;

        //median
        long median = fib[n / 2];

        System.out.printf("The mean is %.2f%n", mean);
        System.out.println("The median is " + median);
    }
}
