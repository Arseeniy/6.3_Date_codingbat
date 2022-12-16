package com.arseeniy.datecodingbat;


import java.util.Arrays;
import java.util.List;

//String-3 > countYZ

public class Second {
    public int countYZ(String str) {
        int count = 0;
        List<String> stringList = Arrays.asList(str.split("[^A-Za-z]"));
        for (String word: stringList){
            if (word.toLowerCase().endsWith("y") || word.toLowerCase().endsWith("z")){
                count++;
            }
        }
        return count;
    }
}
