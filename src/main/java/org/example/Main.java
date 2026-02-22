package org.example;

public class Main {
    public static void main(String[] args) throws Exception {

        int a = 10;
        int b = 5;
        int sum = a + b;

        System.out.println("Sum = " + sum);

        // keep container running
        while (true) {
            Thread.sleep(10000);
        }
    }
}
