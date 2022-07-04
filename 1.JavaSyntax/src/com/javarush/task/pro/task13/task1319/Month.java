package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    //напишите тут ваш код
    public static Month[] getWinterMonths(){
        Month[] monthsWinter = {DECEMBER,JANUARY,FEBRUARY};
        return monthsWinter;
    }
    public static Month[] getSpringMonths(){
        Month[] monthsSpring = {MARCH,APRIL,MAY};
        return monthsSpring;
    }
    public static Month[] getSummerMonths(){
        Month[] monthsSummer = {JUNE,JULY,AUGUST};
        return monthsSummer;
    }
    public static Month[] getAutumnMonths(){
        Month[] monthsAutumn = {SEPTEMBER,OCTOBER,NOVEMBER};
        return monthsAutumn;
    }


}
