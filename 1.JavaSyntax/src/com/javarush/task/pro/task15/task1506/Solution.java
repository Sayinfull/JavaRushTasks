package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            var input = Files.newInputStream(Paths.get(sc.nextLine()));
            var output = Files.newOutputStream(Paths.get(sc.nextLine()));
        } catch (IOException e) {
            System.out.println("Something wrong " + e);
        }
    }
}

