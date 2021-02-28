class Solution {
public:
    map<char ,string> mp ={{'2',"abc"},{'3',"def"},{'4',"ghi"},{'5',"jkl"},{'6',"mno"},{'7',"pqrs"},{'8',"tuv"},{'9',"wxyz"}};
    vector<string> res;
    string cur;
    vector<string> letterCombinations(string digits) {
        if (!digits.size())
        {
            return res;
        }
        dfs(digits);
        return res;
    }
    void dfs(string str)
    {
        if (!str.size())
            res.push_back(cur);
        else {
            char num = str[0];
            string s = mp[num];
            for (int i=0;i<s.size();i++)
            {
                cur.push_back(s[i]);
                dfs(str.substr(1));
                cur.pop_back();
            }
        }
    }
};
