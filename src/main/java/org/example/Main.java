package org.example;

import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс, вызывающий функцию, считыващую .csv файл в List.
 * @author  Slivkin Sergey
 * @version 1.0
 */

public class Main {

    /**
     * Метод, вызывающий основную функцию считывающую .csv
     * и выводящий полученный список в консоль.
     * @param args Не используется.
     * @throws CsvException Если разбор строки не удался.
     * @throws IOException Если файл не найден.
     */
    public static void main(String[] args) throws CsvException, IOException {
        List<Person> list;
        list = csvParser.read("foreign_names.csv");
        for(Person i : list) System.out.println(i);
    }
}