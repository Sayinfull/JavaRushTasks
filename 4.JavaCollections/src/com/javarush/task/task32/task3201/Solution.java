package com.javarush.task.task32.task3201;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Запись в существующий файл
*/

public class Solution {
    public static void main(String... args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(args[0], "rw");
        long number = Long.parseLong(args[1]);
        long length = randomAccessFile.length();
        number = Math.min(number, length);
        randomAccessFile.seek(number);
        randomAccessFile.write(args[2].getBytes());
    }
}
