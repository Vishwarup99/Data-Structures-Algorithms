class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();

        for(int i=0;i< nums.length;i++){
            if (!freq.containsKey(nums[i])){
                freq.put(nums[i],1);
            } else {
            freq.put(nums[i],freq.get(nums[i])+1);
            }
        }


        PriorityQueue<Integer> p1 = new PriorityQueue<>((a,b)-> freq.get(b) - freq.get(a));

        for(int key: freq.keySet()){
            p1.add(key);
        }
    int[] result = new int[k];

    for(int i=0;i<k;i++){
        result[i] = p1.poll();
    }

    return result;
    }
}
