package programmers.problem_12982;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,5,4}, 9));
    }

    public static int solution(int[] d, int budget) {
        var sorted = Arrays.stream(d).sorted().toArray();

        int cnt = 0;
        int sum = 0;
        while (true) {
            sum += sorted[cnt];

            if (sum <= budget) {
                cnt++;
            } else break;

            if (cnt == sorted.length) break;
        }

        return cnt;
    }
}
