class Solution {
    public int[] twoSum(int[] nums, int target) {
        // map <int value, int index>
        Map<Integer, Integer> store = new HashMap<>();

        // iterate through nums and store in hashmap
        for (int i = 0; i < nums.length; i++) {
            store.put(nums[i], i);
        }

        // iterate again and find target
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (store.containsKey(complement)) {
                if (store.get(complement) != i) {
                    return new int[]{i, store.get(complement)};
                }
            }
        }

        return new int[]{};
    }
}