class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> h1 = new HashSet<>();
        int longest = 0;
        for (int i=0;i< nums.length; i++){
            h1.add(nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            if(!h1.contains(nums[i]-1)) {
                int length = 1;
                while(h1.contains(nums[i] + length)){
                    length++;
                }
                longest = Math.max(longest,length);
            }
        }

        return longest;
    }
}
