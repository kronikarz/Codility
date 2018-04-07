package com.codility.Lesson2_Arrays.CyclicRotation;

public class Solution {
    public int[] solution(int[] A, int K) {

        int length = A.length;

        if (length <= 1 || K == 0 || K % length == 0)
            return A;

        int answer[] = new int[length], index;

        for (int i = 0; i < length; i++) {

            if (i + K >= length)
                index = (i + K) % length;
            else
                index = i + K;

            answer[index] = A[i];
        }
        return answer;
    }
}