package com.arseeniy.datecodingbat;


import java.util.Arrays;
import java.util.List;

//String-3 > gHappy

public class Third {

    public boolean gHappy(String str) {
        if (str.isEmpty()) {
            return true;
        }
        boolean isHappy = false;
        List<String> stringList = Arrays.asList(str.split("[^g]"));
        for (String letter : stringList) {
            if (letter.length() > 1) {
                isHappy = true;
            } else {
                isHappy = false;
            }
        }
        return isHappy;
    }
}
