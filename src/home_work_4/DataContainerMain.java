package home_work_4;

import home_work_4.DataContainer;

import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {

        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777, 7});
        System.out.println("номер позиции в которую были вставлены данные: " + container.add(777));

        //Вывод массива на экран для проверки
        for (Integer container1: container.getItems()) {System.out.print(container1 + ", ");}
        System.out.println("");

        System.out.println("Данные, переданные во внутренне поле data: " + container.get(container.add(777)));

        System.out.println("поле data: " + container.getItems());

        System.out.println("Удаление элемента по индексу: " + container.indexDelete(0));

        //Вывод массива на экран для проверки
        for (Integer container2: container.getItems()) {System.out.print(container2 + ", ");}
        System.out.println("");

         System.out.println("Удаление элемента: " + container.itemDelete(87));

        //Вывод массива на экран для проверки
        for (Integer container3: container.getItems()) {System.out.print(container3 + ", ");}
        System.out.println("");

    }
}
