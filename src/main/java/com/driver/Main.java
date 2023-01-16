package com.driver;

public class Main {
    static class Product {
        // Task 3
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5
        public double product(double x, double y) {
            return x * y;
        }
    }
    public static void main(String[] args) {

        // Task 1


        // Task 2
        Product p = new Product();

        // Task 3 call
        int res1 = p.product(2, 3);
        //System.out.println("result: " + res1); // Output: 6

        // Task 4 call
        int res2 = p.product(2, 3, 4);
        //System.out.println("result: " + res2); // Output: 24

        // Task 5 call
        double res3 = p.product(2.5, 3.5);
        //System.out.println("result: " + res3); // Output: 8.75
    }
}
