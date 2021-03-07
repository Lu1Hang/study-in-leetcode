class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        sort(nums.begin(),nums.end());
        int sum = nums[0]+nums[1]+nums[2];
        for (int i=0;i<nums.size()-2;i++)
        {
            int l = i+1;
            int r = nums.size()-1;
            int k = 0;
            while (l<r)
            {
                k = nums[i]+nums[l]+nums[r];
                if (abs(k-target) < abs(sum-target))
                {
                    sum = k;
                }
                if (k>target)
                {
                    r--;
                }
                else if (k<target)
                    l++;
                else 
                return target;
            }
        }
        return sum;
    }
};
