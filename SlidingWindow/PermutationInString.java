class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length() || s2.length()==0)
        return false;

        int len= s1.length();
        for(int i =0;i<=s2.length()-len;i++)
        {
            String sub= s2.substring(i,i+len);
            if(checkIfPer(sub,s1)== true)
            return true;
        }
        return false;  
    }
    boolean checkIfPer(String s2, String s3)
    {
        char[] arr1 = s2.toCharArray();
        char[] arr2 = s3.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return (Arrays.equals(arr1,arr2));
    }

}
