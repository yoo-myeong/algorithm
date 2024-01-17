package programmers.problem_12906;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
    }

    public static int[] solution(int []arr) {
        final int[] beforeNum = {-1};

        int[] answer = Arrays.stream(arr).filter(i -> {
            if (i != beforeNum[0]) {
                beforeNum[0] = i;
                return true;
            }
            return false;
        }).toArray();

        return answer;
    }
}
