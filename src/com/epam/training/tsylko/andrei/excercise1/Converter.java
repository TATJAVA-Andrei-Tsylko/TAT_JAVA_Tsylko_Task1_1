package com.epam.training.tsylko.andrei.excercise1;

public class Converter {
    public static int[] castNumberToOrderOfMagnitude(int number) {
        int arraySize = 4;
        int[] array = new int[arraySize];
        int i = 0;
        while (number < arraySize) {
            array[i] = number % 10;
            number = number / 10;
            i++;
        }
        return array;
    }
}
