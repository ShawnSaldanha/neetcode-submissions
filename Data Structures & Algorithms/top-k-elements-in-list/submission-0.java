class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }
        List<Integer>[] buckets = new List[nums.length + 1];
        for(int i = 0 ; i < buckets.length ; i++){
            buckets[i] = new ArrayList<>();
        }
        for(int num : map.keySet()){
            int frequency = map.get(num);
            buckets[frequency].add(num);
        }
        int[] result = new int[k];
        int resultIndex = 0;
        for (int i = buckets.length - 1; i >= 0; i--) {
            for (int num : buckets[i]) {
                result[resultIndex] = num;
                resultIndex++;
                if (resultIndex == k) {
                    return result;
                }
            }
        }
        return result;
    }
}
