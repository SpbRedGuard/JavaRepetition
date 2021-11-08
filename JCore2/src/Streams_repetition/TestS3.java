package Streams_repetition;

import java.util.Arrays;

public class TestS3 {

    // Метод ForEach  в Stream
    // ПРИМЕР 1.
    public static void main(String[] args) {

        int[] array = {5,3,4,14,15,43,9,21,12,8};

        Arrays.stream(array).forEach(el -> {el*=2;
            System.out.println(el);});


    // ПРИМЕР 2. Метод РЕФЕРЕНС
        Arrays.stream(array).forEach(System.out::println);


    // ПРИМЕР 3.
        Arrays.stream(array).forEach(el ->Utils.myMethod(el));
        //короткое написание лямбды
        Arrays.stream(array).forEach(Utils::myMethod);

    }



}

    class Utils {
        public static void myMethod (int a) {
         a=a+5;
            System.out.println("Element = " + a);
        }
}