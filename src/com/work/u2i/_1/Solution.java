package com.work.u2i._1;

class Solution {
    public int solution(int[] A) {
        int length = A.length;

        if (length > 3) {
            int idxStart = 0, idxEnd = length - 1, counter = 1, diffBefore, diffAfter;
            boolean upBefore = false, upAfter = false, downBefore = false, downAfter = false;

            while ((A[idxStart] == A[idxStart + 1]) && (idxStart < (idxEnd - 1)))
                idxStart++;

            while ((A[idxEnd - 1] == A[idxEnd]) && (idxStart < (idxEnd - 1)))
                idxEnd--;

            diffBefore = (A[idxEnd - 1] - A[idxEnd]);
            if (diffBefore != 0) counter++;

            for (idxStart++; idxStart < idxEnd; idxStart++) {
                //compare  A[idxStart - 1] & A[idxStart]
                diffBefore = (A[idxStart - 1] - A[idxStart]);
                if (diffBefore < 0) upBefore = true;
                if (diffBefore > 0) downBefore = true;

                //compare A[idxStart] & A[idxStart+1]
                diffAfter = (A[idxStart] - A[idxStart + 1]);
                if (diffAfter < 0) upAfter = true;
                if (diffAfter > 0) downAfter = true;

                if ((upBefore && downAfter) || (downBefore && upAfter)) {
                    counter++;
                    upBefore = false;
                    upAfter = false;
                    downBefore = false;
                    downAfter = false;
                }
            }
            return counter;
        } else if (length == 1) {
            return 1;
        } else if (length == 2) {
            if (A[0] != A[1])
                return 2;
            else
                return 1;
        } else {
            if (A[0] == A[1] && A[0] == A[2])
                return 1;
            else if ((A[1] > A[0] && A[1] > A[2]) || (A[1] < A[0] && A[1] < A[2]))
                return 3;
            else
                return 2;
        }
    }
}