package com.thoughtworks.exercises;


public class FizzBuzz {

    public static void main(String[] args) {
        fizzBuzz();
    }

    private static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            String result = "";

            if (i % 3 == 0) result += "Fizz";
            if (i % 5 == 0) result += "Buzz";
            if (result.equals("")) result += i;

            System.out.println(result);
        }
    }
}
