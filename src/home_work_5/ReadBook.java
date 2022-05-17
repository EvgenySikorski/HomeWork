package home_work_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadBook {

    private String fileName;

    public ReadBook(String fileName) {
        this.fileName = fileName;
    }

    /**
     *Метод, который читает переданный файл (fileName) и возвращает текст в виде строки
     * @return возвращает переданный файл в виде строки
     */
    public String readFile() {
        StringBuilder builder = new StringBuilder();

        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            String str = null;
            do {
                str = in.readLine();

                if (str != null) {
                    builder.append(str).append("\n");
                }
            } while (str != null);

        } catch (FileNotFoundException e) {
            System.out.println("Мы не смогли открыть файл");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтения файла");

        }
        return builder.toString();
    }
}



