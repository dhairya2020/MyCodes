class Solution {
    public int shortestSubarray(int[] nums, int k) {
    int n=nums.length,minLen=Integer.MAX_VALUE;
    for(int l=0;l<n;l++)
    {   int sum =0;
        for(int r=l;r<n;r++)
        {
            sum =sum+nums[r];
            if(sum>=k)
            {
                minLen =Math.min(minLen,r-l+1);
                break;
            }
        }
    }
    return minLen == Integer.MAX_VALUE?-1:minLen;
    }
}
