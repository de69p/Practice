package recursion;

import java.util.ArrayList;
import java.util.List;

public class BacktrackingExample {
    public static List<List<Integer>> findSubsets(int[] nums, int targetSum) {
        List<List<Integer>> subsets = new ArrayList<>();
        backtrack(nums, targetSum, 0, new ArrayList<>(), subsets);
        return subsets;
    }

    private static void backtrack(int[] nums, int targetSum, int index, List<Integer> current, List<List<Integer>> subsets) {
        if (targetSum == 0) {
            subsets.add(new ArrayList<>(current));
            return;
        }

        if (targetSum < 0 || index >= nums.length) {
            return;
        }

        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            backtrack(nums, targetSum - nums[i], i + 1, current, subsets);
            current.remove(current.size() - 1);
        }
    }
}
