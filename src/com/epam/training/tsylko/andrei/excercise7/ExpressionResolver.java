package com.epam.training.tsylko.andrei.excercise7;


import java.util.Map;
import java.util.TreeMap;

public class ExpressionResolver {
    public static Map resolveExpression(double a, double b, double h) {
        Map<Double, Double> result = new TreeMap<>();
        if (checkInputtedStep(h)) {
            for (; a <= b; a += h) {
                result.put(a, (Math.pow(Math.sin(a), 2.0) - Math.cos(2.0 * a)));
            }
        }
        return result;
    }

    private static boolean checkInputtedStep(double step) {
        if (step > 0) {
            return true;
        } else {
            return false;
        }
    }

}
