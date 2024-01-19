package programmers.problem_12930;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution("    try  hello   world   "));
    }

    public static String solution(String s) {
        s = s.replaceAll("\\s+", " ");
        String[] strs = s.split(" ");

        String[] newStrs = Arrays.stream(strs).map(e -> {
            char[] chs = e.toCharArray();

            for (int i = 0; i < chs.length; i++) {
                if ((i + 2) % 2 == 0) chs[i] = Character.toUpperCase(chs[i]);
                else chs[i] = Character.toLowerCase(chs[i]);
            }

            return new String(chs);
        }).filter(e -> !e.isEmpty()).toArray(String[]::new);

        return String.join(" ", newStrs);
    }
}
