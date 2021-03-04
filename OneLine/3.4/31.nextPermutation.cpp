class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int n = nums.size()-2;
        while (n>=0 && nums[n] >= nums[n+1])
            n--;
        if (n>=0)
        {
            int m = nums.size()-1;
            while (m>=0 && nums[m] <=nums[n])
                m--;
                swap(nums[n],nums[m]);
        }
        reverse (nums.begin() +n+1 ,nums.end());
    }
};
