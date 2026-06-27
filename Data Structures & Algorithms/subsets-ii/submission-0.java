class Solution {

    Set<List<Integer>> set = new HashSet<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        solve(0, nums, new ArrayList<>());

        return new ArrayList<>(set);
    }

    private void solve(int index, int[] nums, List<Integer> curr) {

        if (index == nums.length) {
            set.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[index]);
        solve(index + 1, nums, curr);

        curr.remove(curr.size() - 1);

        solve(index + 1, nums, curr);
    }
}