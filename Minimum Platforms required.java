class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        int count = 0, i = 0, j=0, maxCount =0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        while(i<arr.length){
            if(arr[i] <= dep[j]){
                count+=1;
                i = i+1;
            } else {
                count -=1;
                j = j+1;
            }
            maxCount = Math.max(count,maxCount);
        }
        return maxCount;
    }
    
}

