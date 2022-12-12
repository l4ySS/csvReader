package org.example;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *  Класс содержащий основную функцию считывания .csv файла.
 @author Slivkin Sergey
 */

public class csvParser {
    /**
     * Метод, выполняющий считывание .csv файла в List.
     * @param csvFilePath Путь исходного .csv файла.
     * @return List Список состоящий из элементов типа Person.
     * @throws CsvValidationException Если разбор строки не удался.
     * @throws IOException Если файл не найден.
     */
    public static List read(String csvFilePath) throws IOException, CsvValidationException {
        List<Person> list = new ArrayList<Person>();
        try (InputStream in = csvParser.class.getClassLoader().getResourceAsStream(csvFilePath)){
            CSVReader reader = in == null ? null : new CSVReader(new InputStreamReader(in));
            if (reader == null) {
                throw new FileNotFoundException(csvFilePath);
            }
            String[] nextLine;
            int i = 0;

            while ((nextLine = reader.readNext()) != null) {
                Person tmp = new Person(Arrays.toString(nextLine), i);
                list.add(tmp);
                i++;
            }
        }
        return list;
    }
}

