package com.codility.Lesson2_Arrays.OddOccurrencesInArray;

public class Solution {
    public int solution(int[] A) {

        int xor = 0, length = A.length, array[] = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = A[i];
            xor ^= A[i];
        }

        return xor;
    }

//        int answer = 0, length = A.length;
//
//        for (int i = 0; i < length; i++) {
//            answer = A[i];
//            for (int j = i; j < length; j++) {
//
//                if (j == i && j < length - 1)
//                    j++;
//                if (answer == 0)
//                    break;
//                if (answer == A[j] && j != i) {
//                    A[j] = 0;
//                    break;
//                }
//                if (j == length - 1)
//                    return answer;
//            }
//        }
//        return -1;
//    }
}