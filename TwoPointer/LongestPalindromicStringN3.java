class Solution {
public:
    string longestPalindrome(string s) {
        char[] res=s.toCharArray();
        int s = res.size();
        int l=0,min=0;
        int r=s-1;
        string sub,prod;
        while(l<s-2)
        {
            if(res[l]==res[r])
            {
                if(isPalindrome(l,r))
                {
                    sub=s.substring(l,r);
                    if(sub.length()>min)
                    {   
                        prod=sub;
                        min=sub.length();
                    }
                }
            }
            else l++;
        }
        return prod;

        
    }
    boolean isPalindrome(char arr[])
    {
        while(l!=r)
        {
            if(arr[l]==arr[r])
            {
                l=l++;
                r=r--;
            }
            else return false;
        }
        return true;
    }
};
