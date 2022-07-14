package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String readBuff = bufferedReader.readLine();
        int minByte = Integer.MAX_VALUE;
        FileInputStream fileInputStream = new FileInputStream(readBuff);

        while (fileInputStream.available() > 0) {
            int countByte = fileInputStream.read();
            if (countByte < minByte) {
                minByte = countByte;
            }
        }
        System.out.println(minByte);
        bufferedReader.close();
        fileInputStream.close();
    }
}
