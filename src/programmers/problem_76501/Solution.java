package programmers.problem_76501;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 7, 12}, new boolean[]{true, false, true}));
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int length = absolutes.length;

        for (int i = 0; i < length; i++) answer += (signs[i] ? absolutes[i] : absolutes[i] * -1);

        return answer;
    }
}
