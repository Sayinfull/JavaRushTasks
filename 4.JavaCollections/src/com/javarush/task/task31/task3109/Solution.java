package com.javarush.task.task31.task3109;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/* 
Читаем конфиги
*/

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Properties properties = solution.getProperties("4.JavaCollections/src/com/javarush/task/task31/task3109/properties.xml");
        properties.list(System.out);

        properties = solution.getProperties("4.JavaCollections/src/com/javarush/task/task31/task3109/properties.txt");
        properties.list(System.out);

        properties = solution.getProperties("4.JavaCollections/src/com/javarush/task/task31/task3109/notExists");
        properties.list(System.out);
    }

    public Properties getProperties(String fileName) {
        try {
            Properties properties = new Properties();
            Path path = Paths.get(fileName);
            InputStream fileInputStream = new FileInputStream(fileName);

            if (path.toString().endsWith(".xml")) {
                properties.loadFromXML(fileInputStream);
                return properties;
            } else {
                properties.load(fileInputStream);
                return properties;
            }
        } catch (IOException e) {
            return new Properties();
        }
    }
}
