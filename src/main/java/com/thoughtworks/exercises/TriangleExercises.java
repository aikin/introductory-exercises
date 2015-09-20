package com.thoughtworks.exercises;


public class TriangleExercises {

    public static void main(String[] args) {
        System.out.println("\n------------- drawAnAsterisk -------------");
        drawAnAsterisk();

        System.out.println("\n------------- drawAHorizontalLine -------------");
        drawAHorizontalLine(8);

        System.out.println("\n------------- drawAVerticalLine -------------");
        drawAVerticalLine(3);

        System.out.println("\n------------- drawARightTriangle -------------");
        drawARightTriangle(3);
    }

    private static void drawAnAsterisk() {
        System.out.println("*");
    }

    private static void drawAHorizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void drawAVerticalLine(int rowCount) {
        for (int rowNum = 0; rowNum < rowCount; rowNum++) {
            System.out.println("*");
        }
    }

    private static void drawARightTriangle(int rowCount) {
        for (int rowNum = 1; rowNum <= rowCount; rowNum++) {
            drawAHorizontalLine(rowNum);
        }
    }
}
