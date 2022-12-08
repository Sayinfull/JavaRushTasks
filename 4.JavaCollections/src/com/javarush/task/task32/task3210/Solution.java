package com.javarush.task.task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws IOException {
        String fileName = args[0];
        long number = Long.parseLong(args[1]);
        String text = args[2];
        RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "rw");

        randomAccessFile.seek(number);
        byte[] array = new byte[text.length()];
        randomAccessFile.read(array, 0, text.length());

        String readText = new String(array);

        randomAccessFile.seek(randomAccessFile.length());
        if (readText.equals(text)) {
            randomAccessFile.write("true".getBytes());
        } else {
            randomAccessFile.write("false".getBytes());
        }

    }
}
