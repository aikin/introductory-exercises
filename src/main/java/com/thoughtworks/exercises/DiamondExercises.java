package com.thoughtworks.exercises;


public class DiamondExercises {

    public static void main(String[] args) {
        System.out.println("\n------------- drawAnIsoscelesTriangle -------------");
        drawAnIsoscelesTriangle(3);

        System.out.println("\n------------- drawADiamond -------------");
        drawADiamond(3);

        System.out.println("\n------------- drawADiamondWithYourName -------------");
        drawADiamondWithYourName(3, "lulaijin");
    }

    private static void drawAnIsoscelesTriangle(int rowCount) {
        for (int i = 0; i < rowCount; i++) {
            for (int j = i; j < rowCount - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawAnInvertedIsoscelesTriangle(int rowCount) {
        for (int i = rowCount - 1; i >= 0; i--) {
            for (int j = i; j < rowCount; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawADiamond(int rowCount) {
        drawAnIsoscelesTriangle(rowCount);
        drawAnInvertedIsoscelesTriangle(rowCount - 1);
    }

    private static void drawADiamondWithYourName(int rowCount, String name) {
        for (int i = 0; i < rowCount - 1; i++) {
            for (int j = i; j < rowCount - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(name);

        drawAnInvertedIsoscelesTriangle(rowCount - 1);
    }
}
