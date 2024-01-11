package programmers.probelm_77884;

import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(13, 17));
    }

    public static int getMeasureCount(int num) {
        int cnt = 0;

        for (int i = 1; i < num + 1; i++) {
            if (num % i == 0) cnt++;
        }
        return cnt;
    }

    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i < right + 1; i++) {
            int measureCount = getMeasureCount(i);
            if (measureCount % 2 == 0) answer += i;
            else answer -= i;
        }

        return answer;
    }
}
