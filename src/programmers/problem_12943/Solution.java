package programmers.problem_12943;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(626331));
    }

    public static int solution(int num) {
        int cnt = 0;

        if (num == 1) return 0;

        long target = num;
        while (++cnt < 500) {
            if (target % 2 == 0) target /= 2;
            else target = (target *3) + 1;

            if (target == 1) break;
        }

        return cnt == 500 ? -1 : cnt;
    }
}
