package com.work.u2i._2;

class Solution {
    public int solution(int[] T) {
        int length = T.length, max = T[0], maxTmp = T[0], result = 1;

        for (int i = 0; i < length; i++) {
            if (T[i] > maxTmp)
                maxTmp = T[i];
            if (T[i] <= max) {
                result = i + 1;
                max = maxTmp;
            }
        }
        if (result == length)
            return --result;
        return result;
    }
}