package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= cathetusLength; i++) {

            for (int j = 1; j <= cathetusLength - i; j++) {
                result.append(" ");
            }


            for (int j = 1; j <= i; j++) {
                result.append("*");
            }

            result.append("\n");
        }

        System.out.print(result.toString());
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
