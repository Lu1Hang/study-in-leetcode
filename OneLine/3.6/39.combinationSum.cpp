class Solution {
public:
    vector<vector<int>> res;
    vector<int> tmp;
        vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        res.clear();
        tmp.clear();
        sort(candidates.begin(),candidates.end());
        dfs(candidates,target,0,0);
        return res;
    }
    void dfs(vector<int> &candidates,int target,int k,int sum)
    {
        if (sum==target)
        {
            res.push_back(tmp);
            return;
        }
        else {
             int len = candidates.size();
            for (int i = k; i < len;i++)
            {
                sum = sum+candidates[i];
                if (sum>target)break;
                tmp.push_back(candidates[i]);
                
                dfs(candidates,target,i,sum);
                tmp.pop_back();
                sum = sum-candidates[i];
            }
            return;
        }
    //遇到heap-buffer-ovorflow 内存存在非法访问
    //排查代码，发现数组访问越界，导致此错，将申请的数组空间加大，问题解决
    //该题的循环没有控制好，导致死循环
    }

};
