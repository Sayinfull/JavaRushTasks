package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int count1 = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                count1++;
            }
        }
        return count1;
    }

    public static int countLetters(String string) {
        int count2 = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))){
                count2++;
            }
        }
        return count2;
    }

    public static int countSpaces(String string) {
        int count3 = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isWhitespace(string.charAt(i))){
                count3++;
            }
        }
        return count3;
    }
}
