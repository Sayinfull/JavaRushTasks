package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* 
Генератор паролей
*/

public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String[] LOWER = "abcdefghijklmnopqrstuvwxyz".split("");
        String[] UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        String[] DIGITS = "0123456789".split("");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 2; i++) {
            int x = ((int) (Math.random() * DIGITS.length));
            sb.append(DIGITS[x]);
        }
        for (int i = 0; i < 3; i++) {
            int x = ((int) (Math.random() * LOWER.length));
            sb.append(LOWER[x]);
        }
        for (int i = 0; i < 3; i++) {
            int x = ((int) (Math.random() * UPPER.length));
            sb.append(UPPER[x]);
        }
        String transformationToString = sb.toString();
        try {
            byteArrayOutputStream.write(transformationToString.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream;
    }
}
