package org.example;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Reader {
    public static void read(String csvFilePath) throws IOException, CsvException {
        try (CSVReader reader = new CSVReader(new FileReader("file.csv"))) {
            List<String[]> r = reader.readAll();
            r.forEach(x -> System.out.println(Arrays.toString(x)));
        }
        }
    }

}
