package programmers.problem_12931;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(123));
    }

    public static int solution(int n) {
        int answer = 0;

        String str = String.valueOf(n);
        for (char ch: str.toCharArray()) {
            System.out.println(ch);
            answer += Character.getNumericValue(ch);
        }

        return answer;
    }
}
