package programmers.problem_68935;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(45));
    }

    public static int solution(int n) {
        String threeNums = Integer.toString(n, 3);

        StringBuffer sb = new StringBuffer(threeNums);
        String reversed = sb.reverse().toString();

        return Integer.parseInt(reversed, 3);
    }
}
