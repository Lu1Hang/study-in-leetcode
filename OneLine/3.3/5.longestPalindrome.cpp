class Solution {
public:
    string longestPalindrome(string s) {
        int len = s.length();
        if (len==0 || len==1)
        return s;
        int start = 0, end = 0,maxx = 0;
        for (int i=0;i<len;i++)
        {
            int len1 = expand(s,i,i);
            int len2 = expand(s,i,i+1);
            maxx = max(max(len1,len2),maxx);
            if (maxx > end-start+1 )
            {
                start = i - (maxx-1)/2;
                end = i + maxx/2;
            }
        }
        //if (start < 0 )
       // return s.substr(0,maxx);
         return s.substr(start,maxx);
    }
private:
    int expand(string s,int left ,int right)
    {
        int l = left , r = right;
        int num = 0;
        if (s[l]!=s[r])return 0;
        while (l-1 >= 0 && r+1 < s.length() && s[l-1]==s[r+1])
        {
            l--;r++;
        }
        return r-l+1;
    }
};
