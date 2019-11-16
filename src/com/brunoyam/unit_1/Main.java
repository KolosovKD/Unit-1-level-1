package com.brunoyam.unit_1;

import com.brunoyam.unit_1.utils.Generator;

import java.util.Arrays;

public class Main {

    private static int[] oneDimensionArray = Generator.getOneDimensionArray();

    private static void level1() {
        /*
         Выберите подходящий тип переменных, в которые будут сохраняться значения.
         Не забудьте, что метод, вычисляющий значение переменной должен возвращать тот же тип.
        */
        /*тип*/ minValue = findMinValue(oneDimensionArray);
        /*тип*/ maxValue = findMaxValue(oneDimensionArray);
        /*тип*/ sumOfValues = sumValues(oneDimensionArray);
        /*тип*/ firstPositiveIndex = getFirstPositiveIndex(oneDimensionArray);
        /*тип*/ firstNegativeIndex = getFirstNegativeIndex(oneDimensionArray);


        System.out.println("First part");

        System.out.println("min: " + minValue);
        System.out.println("max: " + maxValue);
        System.out.println("sum: " + sumOfValues);

        System.out.println();
        System.out.println("length: " + oneDimensionArray.length);
        System.out.println("first positive index: " + firstPositiveIndex);
        System.out.println("first negative index: " + firstNegativeIndex);
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static /*тип*/ findMinValue(int[] arrayOfValues) {
        /* Укажите тип переменной */
        /*тип*/ minValue = arrayOfValues[0];
        /*
           Используя цикл for переберите все значения массива и сохраните минимальное в переменную minValue.
         */
        return minValue;
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static /*тип*/ findMaxValue(int[] arrayOfValues) {
        /* Укажите тип переменной */
        /*тип*/ maxValue = arrayOfValues[0];
        /*
           Используя цикл for переберите все значения массива и сохраните максимальное в переменную maxValue.
         */
        return maxValue;
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static /*тип*/ sumValues(int[] arrayOfValues) {
        /* Укажите тип переменной */
        /*тип*/ sum = 0;
        /* Используя цикл for переберите все значения массива, просуммируйте и сохраните сумму всех значений в переменную sum. */
        return sum;
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static /*тип*/ getFirstPositiveIndex(int[] arrayOfValues) {
        /* Укажите тип переменной */
        /*тип*/ firstPositiveIndex = 0;
        /* Используя цикл while найдите индекс первого положительного значения в массиве и сохраните в переменную firstPositiveIndex */
        return firstPositiveIndex;
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static /*тип*/ getFirstNegativeIndex(int[] arrayOfValues) {
        /* Укажите тип переменной */
        /*тип*/ firstNegativeIndex = 0;
        /* Используя цикл while найдите первое отрицательное значение и сохраните в переменную firstNegativeIndex */
        return firstNegativeIndex;
    }

    public static void main(String[] args) {
        level1();
    }

}
