package com.arseeniy.datecodingbat;


//Array-3 > countClumps

public class First {

    public int countClumps(int[] nums) {
        int countClumps = 0;
        int isTheSame = 0;
        int baseNumber = 0;
        if (nums.length > 0) {
            baseNumber = nums[0];
        }
        for (int i = 1; i < nums.length; i++) {
            int currentNumber = nums[i];
            if (baseNumber == currentNumber) {
                isTheSame++;
                if (isTheSame == 1) {
                    countClumps++;
                }
            } else {
                baseNumber = currentNumber;
                isTheSame = 0;
            }
        }
        return countClumps;
    }
}
