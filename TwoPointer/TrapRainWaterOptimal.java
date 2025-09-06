//TwoPointer: left=0--right=n-1;
//move the pointer according to the min of left and right and keep updating leftMAx and rightMAx both
//if height is less than leftMax or rightMax then it is added else the pointer is moved
// dont forget to subtract height
class Solution {
    public int trap(int[] height) {
       int l=0,r=height.length-1;
       int leftMax=0, rightMax=0;
       int sum=0;
       while(l<r)
       {
        if(height[l]<height[r])
        {
            if(leftMax<=height[l])
            {
                leftMax=height[l];
            }
            else
            {
                sum=sum+leftMax-height[l];
            }
            l++;
        }
        else{
            if(rightMax<=height[r])
            {
                rightMax=height[r];
            }
            else
            {
                sum=sum+rightMax-height[r];
            }
            r--;
        }
       } 
       return sum;
    }
}
