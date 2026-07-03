class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int num : nums){
            int localMaximum = 0 ;
            int currentNumber = num;
            if(!set.contains(num-1)){
                while(set.contains(currentNumber)){
                    localMaximum++;
                    currentNumber++;
                }
            }
            result = Math.max(localMaximum , result);
        }
        return result;
    }
}
