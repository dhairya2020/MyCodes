//My approach (complexity: n2)
//for each index from 1 to n-1. calculate max on sides and then choose their min
//currSum= min- height(i)
//add to the main sum
class Solution {
    public int trap(int[] height) {
        int sum=0,max=0,currSum=0;
        int n=height.length;
       for(int i=1;i<n-1;i++)
       {  
        int x=findLarge(0,i,height);
        int y=findLarge(i+1,n,height);
        if(x<=height[i]||y<=height[i])
        currSum=0;
        else
        currSum=(Math.min(x,y)-height[i]);
        sum= sum+currSum;
       } 
       return sum;
    }
       int findLarge(int l,int r,int[] height)
       {    int large=0;
        for(int i=l;i<r;i++)
        {
            large=Math.max(large,height[i]);
        }
        return large;
       }
}
