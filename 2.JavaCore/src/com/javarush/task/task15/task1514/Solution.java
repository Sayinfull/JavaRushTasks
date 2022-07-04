package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.1, "salam");
        labels.put(1.2, "sala");
        labels.put(1.3, "salm");
        labels.put(1.4, "saam");
        labels.put(1.5, "sm");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
