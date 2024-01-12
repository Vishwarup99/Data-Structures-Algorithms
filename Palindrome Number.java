class Solution {
public:
    bool isPalindrome(int x) {
        long reversenum=0;
        int temp=0;
        
        int a=x;
        if(x<0)
            return false;
        while(a>0){
            temp=a%10;
            reversenum=reversenum*10+temp;
            a/=10;
        }
            if(x==reversenum)
                return true;
            else
                return false;
        
    }
};
