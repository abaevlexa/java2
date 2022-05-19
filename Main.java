package Lesson1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(" //// Задание 1");
        String[] array = {"one","two","three","four","fifth"};
        System.out.println(Arrays.toString(array));
        swaps(array,1,3);
        System.out.println(Arrays.toString(array));
        System.out.println(" //// Задание 1");

        System.out.println(" //// Задание 2");
        List<String> arrayone = toList(array);
        System.out.println(" //// Задание 2");

        System.out.println(" //// Задание 3");




        System.out.println(" //// Задание 3");

    }


    public static <T> void swaps(T[] arr , int index1,int index2) {
        T elem = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = elem;
    }

    public static <T> List<T> toList(T[] arr) {
        return Arrays.asList(arr);
    }

}
