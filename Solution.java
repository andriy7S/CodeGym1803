package com.codegym.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/* 
Most frequent bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream inputStream = new FileInputStream(fileName);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (!set1.contains(data)) {
                set1.add(data);
            } else {
                if (!set2.contains(data)) {
                    set2.add(data);
                } else {
                    System.out.print(data + "\t");
                }
            }
        }
        inputStream.close();
    }
}
