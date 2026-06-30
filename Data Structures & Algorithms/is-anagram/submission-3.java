class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] freq1 = new char[27];
        char[] freq2 = new char[27];
        for(char c : s.toCharArray()){
            freq1[c - 'a']++;
        }
        for(char c : t.toCharArray()){
            freq2[c - 'a']++;
        }
        for(int i = 0 ; i < 27 ; i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        return true;
    }
}
