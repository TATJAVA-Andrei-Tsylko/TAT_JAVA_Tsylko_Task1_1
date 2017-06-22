package com.epam.training.tsylko.andrei.excercise7;


public class ExpressionResolver {
    public static void showResult(int a, int b, int h) {
        for (; a < b; a += h) {
            System.out.println(a + "\t" + (Math.pow(Math.sin(a), 2.0) - Math.cos(2.0 * a)));
        }
    }
}
