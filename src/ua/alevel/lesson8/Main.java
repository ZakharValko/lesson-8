package ua.alevel.lesson8;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];

        // Наполняем массив случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));
        findNonRepeatElement(array);
    }

    // Метод который находит количество различных элементов в массиве
    public static int findNonRepeatElement(int[] array) {
        int repeat = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] == array[j]){
                    repeat = repeat + 1;
                    break;
                }
            }
        }
        System.out.println(array.length - repeat);
        return array.length - repeat;
    }
}