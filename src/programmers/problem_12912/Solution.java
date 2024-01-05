package programmers.problem_12912;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(5,3));
    }

    public static long solution(int a, int b) {
        long answer = 0;

        long bigger = Math.max(a,b);
        long smaller = Math.min(a, b);

        for (long i = smaller; i < bigger + 1; i++) {
            answer += i;
        }

        return answer;
    }
}
