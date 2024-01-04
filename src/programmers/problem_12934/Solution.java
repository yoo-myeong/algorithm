package programmers.problem_12934;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(121));
    }

    public static long solution(long n) {
        long answer = -1;

        long point = n;
        long target = (long)Math.round(n/2.0);

        while (true) {
            long doubleTarget = target * target;
            if (doubleTarget == n) {
                answer = target;
                break;
            }

            if (doubleTarget > n) {
                point = target;
                target = (long) Math.round(target/2.0);
            }

            if (doubleTarget < n) {
                target = (long) Math.round((target + point)/2.0);
            }

            if (point == target) {
                break;
            }

        }

        if (answer != -1) return (answer+1)*(answer+1);
        return answer;
    }
}
