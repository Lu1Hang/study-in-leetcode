class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int len = digits.size();
        for (int i=len-1;i>=0;i--)
        {
            digits[i]++;
            if (digits[i]%10==0) digits[i]=0;
            else return digits;
        }
        digits.insert(digits.begin(),1);
        digits[0]=1;
        return digits;       
    }
};
