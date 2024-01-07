package programmers.problem_86051;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,2,3,4,6,7,8,0}));
    }

    public static int solution(int[] numbers) {
        int answer = -1;

        Integer[] nums = Arrays.stream(numbers).boxed().toArray(Integer[]::new);

        List<Integer> numList = new ArrayList<>(Arrays.asList(nums));

        answer = IntStream.range(0, 10).filter(i -> !numList.contains(i)).sum();

        return answer;
    }
}
