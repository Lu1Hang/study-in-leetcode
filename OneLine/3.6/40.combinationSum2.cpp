class Solution {
public:
    vector<vector<int>> res;
    vector<int> tmp;
    void dfs(vector<int> candidates,int target,int k,int sum){
        if (sum==target)
        {
            res.push_back(tmp);
            return ;
        }
        int len = candidates.size();
        for (int i=k;i<len;i++)
        {
            if (i>k && candidates[i]==candidates[i-1])continue;
            sum = sum+candidates[i];
            if (sum>target)break;
            tmp.push_back(candidates[i]);
            dfs(candidates,target,i+1,sum);
            sum = sum-candidates[i];
            tmp.pop_back();
        }
        return;
    }

    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        sort(candidates.begin(),candidates.end());
        dfs(candidates,target,0,0);

        return res; 
    }
};
