class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        Set<Character> set = new HashSet<>();
        int left = 0;
        int result = 0;
        set.add(s.charAt(left));
        for(int right = 1; right < s.length() ; right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }   
            set.add(s.charAt(right));
            result = Math.max(right - left + 1 , result);
        }
        return result;
    }
}
