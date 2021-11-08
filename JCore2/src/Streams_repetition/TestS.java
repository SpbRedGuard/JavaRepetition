package Streams_repetition;

// Stream - последовательность элементов, поддерживающих последовательные и параллельные операции над ними.
// Stream поток данных, которые содержат коллекции.
// Stream позволяет писать код в функциональном стиле.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestS {

    //Метод map - преобразует каждый элемент Stream

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("OK");
        list.add("poka");

        // из коллекции получаем стрим, преобразуем из стрим в лист с помощью collect(Collectors.toList()
    List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(list2);

        // map для массива

        int [] array = {3,5,8,3,9,0,13};

        array = Arrays.stream(array).map(element -> {if (element % 3 ==0){element = element/3;}return element;}).toArray();
        System.out.println(Arrays.toString(array));



    }

}
