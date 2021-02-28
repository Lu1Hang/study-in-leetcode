class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        if (!strs.size())
        {
            return "";
        }
        int len = strs[0].size();
        for (int i=0;i<len;i++)
        {
            char c = strs[0][i];
            for (int j=0;j<strs.size();j++)
            { 
                if (strs[j][i]!=c || i==strs[j].size())
                return strs[0].substr(0,i);
            }
        }
        return strs[0];
    }
};
