class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
    vector<vector<int>> ans;
    int len = nums.size();
    sort(nums.begin(),nums.end());
    if (len <4)return ans;
        for (int i=0;i<len-3;i++)
        {
            if (i>0 && nums[i]==nums[i-1])
            continue;
            for (int j=i+1;j<len-2;j++)
            {
                if (j>i+1 && nums[j]==nums[j-1])
                continue;
                int m = len-1;
                int num = target-nums[i] - nums[j];
                for (int k=j+1;k<len;k++)
                {
                    if (k>j+1 && nums[k]==nums[k-1])
                    continue;
                    while (k< m && nums[k]+nums[m] > num)
                    m--;
                    if (k==m)break;
                    if (nums[k]+nums[m]==num)
                    ans.push_back({nums[i],nums[j],nums[k],nums[m]});
                }
            }
        }
        return ans;
    }
};
