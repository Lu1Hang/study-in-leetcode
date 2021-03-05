class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int len = nums.size();
        int left = 0,right = len-1 ,mid,ans = len;
        while (left <= right)
        {
            mid = (left+right)/2;
            if (nums[mid] >= target )
            {
                ans = mid;
                right = mid-1;
            }
            else 
            {
                left = mid+1;
            }
        }
        return ans; 
    }
};
