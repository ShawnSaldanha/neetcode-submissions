class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = s.length();
        int[] frequency = new int[26];
        int maxFrequency = 0;
        int result = Integer.MIN_VALUE;
        for(right = 0 ; right < s.length() ; right++){
            frequency[s.charAt(right) - 'A']++;
            maxFrequency = Math.max(maxFrequency , frequency[s.charAt(right) - 'A']);
            int windowSize = right - left + 1;
            if(windowSize - maxFrequency > k){
                frequency[s.charAt(left) - 'A']--;
                left++;
            }
            windowSize = right - left + 1;
            result = Math.max(result , windowSize);
        }
        return result;
    }
}
