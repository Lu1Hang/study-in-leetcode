class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> ans;
        int len = nums.size();
        if (len <3)return ans;
        sort(nums.begin(),nums.end());
        for (int i=0;i<len-2;i++)
        {
            if (i>0 && nums[i]==nums[i-1] )
            continue;
            int num = -nums[i];
            int k = len-1;
            for (int j=i+1;j<len;j++)
                {
                if (j>i+1 && nums[j]==nums[j-1])
                continue;
                while (j<k && nums[j]+nums[k]>num)
                k--;
                if (j==k)break;
                if (nums[j]+nums[k]==num)
                    ans.push_back({nums[i],nums[j],nums[k]});
                }
        }
        return ans;
    }
};
