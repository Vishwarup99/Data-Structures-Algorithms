class Solution {
    public boolean halvesAreAlike(String s) {
        int left = 0 , right = s.length() - 1;
        int countOfVowels = 0;
        while(left < right){
            if(s.charAt(left) == 'a' || s.charAt(left) == 'e' || s.charAt(left) == 'i' ||
            s.charAt(left) == 'o' || s.charAt(left) == 'u' || s.charAt(left) == 'A' || s.charAt(left) == 'E' || s.charAt(left) == 'I' ||
            s.charAt(left) == 'O' || s.charAt(left) == 'U'){
                countOfVowels += 1;
            }
            if(s.charAt(right) == 'a' || s.charAt(right) == 'e' || s.charAt(right) == 'i' ||
            s.charAt(right) == 'o' || s.charAt(right) == 'u' || s.charAt(right) == 'A' || s.charAt(right) == 'E' || s.charAt(right) == 'I' ||
            s.charAt(right) == 'O' || s.charAt(right) == 'U'){
                countOfVowels -= 1;
            }
            left++;
            right--;
        }
        if (countOfVowels == 0) return true;
        return false;
    }
}
