package programmers.problem_12918;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution("012349"));
    }

    public static boolean solution(String s) {
        int length = s.length();
        if (length != 4 && length != 6) {
            return false;
        }

        for (char ch: s.toCharArray()) {
            if (!Character.isDigit(ch)) return false;
        }

        return true;
    }
}
