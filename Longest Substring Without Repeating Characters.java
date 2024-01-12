class Solution {
    public int lengthOfLongestSubstring(String s) {
        String a = "";
        int maxLength = 0;
        for(int i=0;i<s.length();i++){
            char b = s.charAt(i);
            int index = a.indexOf(b);
            if(index == -1){
                a += b;
            }
            else {
                a = a.substring(a.indexOf(b)+1);
                a+=b;
            }
        maxLength = Math.max(maxLength , a.length());
        }
      return maxLength;  
    }
}
