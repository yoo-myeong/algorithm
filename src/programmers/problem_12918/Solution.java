package programmers.problem_12918;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution("1234"));
    }

    public static boolean solution(String s) {
        boolean answer = true;

        for (char ch: s.toCharArray()) {
            if (!Character.isDigit(ch)) answer = false;
        }

        return answer;
    }
}
