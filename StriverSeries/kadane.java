//find max sum of subArray of an array
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int tempSum=0;
        for(int i =0;i<nums.length;i++)
        {
            tempSum=tempSum+nums[i];
            maxSum= Math.max(maxSum,tempSum);
            if(tempSum<0)
            tempSum=0;
        }
        return maxSum;
    }
}
