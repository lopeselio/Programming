class Solution {
        boolean[] b;
    public List<List<Integer>> permuteUnique(int[] nums) {
        LinkedList<List<Integer>> list  = new LinkedList<List<Integer>>();
        if (nums == null || nums.length == 0)
            return list;
        Arrays.sort(nums);
        b = new boolean[nums.length];
        pre(list, new LinkedList<Integer>(), nums, 0);
        return list;
    }
    public void pre(LinkedList<List<Integer>> list, LinkedList<Integer> l, int[] nums, int n) {
        if (n == nums.length && !list.contains(l))
            list.add(new LinkedList<Integer>(l));
        else {
            for (int start = 0; start < nums.length; start ++) {
                if (b[start]) continue;
                b[start] = true;
                l.add(nums[start]);
                pre(list, l, nums, n + 1);
                l.remove(l.size() - 1);
                b[start] = false;
            }
        }
    }

}
