class Solution {
    public int minSteps(String s, String t) {
        int[] charList = new int[26];
        int ans = 0;
        for (char k: s.toCharArray()){
            charList[k-'a']++;
        }

        for (char l: t.toCharArray()){
            if(charList[l-'a'] > 0){
                charList[l-'a']--;
            } else {
                ans++;
            }
        }

        return ans;
    }
}
