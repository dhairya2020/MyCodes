// edge cases:
//   when total ascending or desending;
// else:
// find i from last for which i+1 is bigger than it.
//   find first j from last bigger than i.
//   swap i, j
//   then reverse the order of array acter i
  class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int j=0,k=0,s=0,l=0;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]<=nums[i+1])
            s++;
            if(nums[i]>=nums[i+1])
            l++;
        }
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
            k=i;
            break;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(nums[i]>nums[k])
            {
            j=i;
            break;
            }
        }
        if(s==n-1||l==n-1)
        {
            reverse(nums,k,n-1);
        }
        else{
        swap(nums,k,j);
        reverse(nums,k+1,n-1);
        }
    }

private void swap(int nums[],int i, int l)
{
        int temp=nums[l];
        nums[l]=nums[i];
        nums[i]=temp;
}
private void reverse(int[] nums, int i,int m)
{
    while(i<m)
    {
        swap(nums,i,m);
        i++;
        m--;
    }
}
}
