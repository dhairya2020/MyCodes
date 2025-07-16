class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
      int sum=0,avg=0,res=0;
        for(int i=0;i<k;i++)
        {
            sum=sum+arr[i];
            avg=sum/k;
        }
        if(avg>=threshold)
        res++;
        for(int i =0;i<arr.length-k;i++)
        {
            sum=sum-arr[i]+arr[i+k];
            avg=sum/k;            
            if(avg>=threshold)
            res++;
        }
        return res;  
    }
}
