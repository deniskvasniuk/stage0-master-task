package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= cathetusLength; i++) {
            // Add leading spaces
            for (int j = 1; j <= cathetusLength - i; j++) {
                result.append(" ");
            }

            // Add decreasing numbers
            for (int j = i; j >= 1; j--) {
                result.append(j);
            }

            // Add increasing numbers
            for (int j = 2; j <= i; j++) {
                result.append(j);
            }

            result.append("\n");
        }

        System.out.print(result.toString());
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
