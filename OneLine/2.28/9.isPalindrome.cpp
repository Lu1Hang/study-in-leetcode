class Solution {
public:
    bool isPalindrome(int x) {
        if (x<0)
        return false;
        else {
            long long y=x;
            long long num = 0;
            while (x!=0)
            {
                int ans= x%10;
                num = num*10+ans;
                x = x/10;
            }
            if (num==y)
            return true;
            else return false;
        }
    }
};
