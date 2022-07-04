package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = null;
        try {
            s1 = bufferedReader.readLine();
            if (s1.equals("helicopter")) {
                result = new Helicopter();
            } else if (s1.equals("plane")) {
                s1 = bufferedReader.readLine();
                result = new Plane(Integer.parseInt(s1));
                bufferedReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
