class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int max = Integer.MIN_VALUE;
        int right = heights.length - 1;
        while(left < right){
            int volume = (right - left) * Math.min(heights[left] , heights[right]);
            max = Math.max(max , volume);
            if(heights[left] < heights[right]){
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
