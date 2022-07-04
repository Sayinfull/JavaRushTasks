package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        int monthIndex = month.ordinal();
        if (monthIndex < Month.values().length - 1) {
            return Month.values()[monthIndex + 1];
        } else return Month.values()[0];
    }
}
