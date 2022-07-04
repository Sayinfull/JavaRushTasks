package com.javarush.task.pro.task15.task1504;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file1 = sc.nextLine();
        String file2 = sc.nextLine();
        try(FileInputStream input = new FileInputStream(file1);
        FileOutputStream output = new FileOutputStream(file2)){
            byte[] buffer = new byte[Byte.MAX_VALUE];
            while (input.available() > 0){
                int real = input.read(buffer);
                output.write(buffer,0,real);
            }
        }
        catch (IOException e){
            System.out.println("asd" + e);
        }
    }
}

