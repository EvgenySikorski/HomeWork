package home_work_4;

import java.util.Arrays;
import java.util.Comparator;


public class DataContainer <T> {
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    /* Метод add добавляет данные во внутреннее поле data и возвращает номер позиции в которую были вставлены данные
    param item - объект, который добавляют во внутреннее поле data
    return номер - позиции в которую были вставлены данные
    */
    public int add(T item) {
        if (data.length == 0) {
            this.data = Arrays.copyOf(data, data.length + 1);
        }

        if (item == null) {
            return -1;
        }

        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }
        data = Arrays.copyOf(data, data.length + 1);
        data[data.length - 1] = item;
        return data.length - 1;
    }

    /* Метод get возвращает из поля data переданый объект на предыдущем шаге через метод add
    param index - индекс возвращаемого объекта
    return - возвращаемый объект
     */

    public T get(int index){
        if (index < 0 || index >= data.length){
            return null;
        }
        return data[index];

    }

    /* Метод getItems возвращает поле data
    return - возвращаемое поле data
     */
    public T[] getItems() {
        return data;
    }

    /* Метод indexDelete который удаляет элемент из поля data по индексу
    param index - индекс элемента, который необходимо удалить
    return - результат удаления true - элемент удален, false - элемент удалить не удалось
     */
    public boolean indexDelete(int index){
        boolean result = false;
    if (index < 0 || index >= data.length){
        return result;
    }   else if (index == data.length-1){
        data = Arrays.copyOf(data, data.length-1);
        result = true;
        return result;
        }
        else{
            for (int i = index; i < data.length-1; i++) {
            data[i] = data[i + 1];
            }
        data = Arrays.copyOf(data, data.length-1);
        result = true;
        return result;
        }
    }
        /* Метод itemDelete который удаляет элемент из поля data
    param item - элемент, который необходимо удалить
    return - результат удаления true - элемент удален, false - элемент удалить не удалось
     */

    public boolean itemDelete(T item){
        boolean result = false;

        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(item)){
                for (int j = i; j < data.length-1; j++) {
                data[j] = data[j + 1];
                }
            data = Arrays.copyOf(data, data.length - 1);
            result = true;
            return result;
            }
        }
        return result;
    }

           /* Метод sort сортировки данных записанных в поле data
    param item - элемент, который необходимо удалить
    return - результат удаления true - элемент удален, false - элемент удалить не удалось
     */

    public void sort(Comparator<T> comparator){
        for (int i = data.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (comparator.compare(data[j], data[j + 1])>0) {
                    T tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;

                }
            }
        }
    }
}











