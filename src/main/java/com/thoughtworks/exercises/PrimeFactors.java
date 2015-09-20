package com.thoughtworks.exercises;


import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static void main(String[] args) {
        System.out.println(generate(30));
    }

    public static List<Integer> generate(int number) {
        List<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }
        return factors;
    }
}
