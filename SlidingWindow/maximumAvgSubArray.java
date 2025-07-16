class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        double res=Integer.MIN_VALUE;
        if(nums==null|| nums.length==0)
        return 0;
        if(nums.length==1)
        return nums[0];
        for(int i=0;i<k;i++)
        {
            sum = sum+nums[i];
        }
        res=sum;
        for(int i=0;i<nums.length-k;i++)
        {
            sum=sum-nums[i]+nums[i+k];
            res=Math.max(res,sum);

        }
        return res/k;
    }
}
