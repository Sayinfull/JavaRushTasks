package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = bufferedReader.readLine();

        int maxByte = 0;
        FileInputStream fileInputStream = new FileInputStream(s1);
        while (fileInputStream.available() > 0) {
            int countByte = fileInputStream.read();
            if (countByte > maxByte) {
                maxByte = countByte;
            }
        }
        System.out.println(maxByte);
        fileInputStream.close();
        bufferedReader.close();
    }
}
