class Solution {
public:
    int lengthOfLongestSubstring(string s) {
            unordered_set<char> tmp;
            int len = s.size();
            int tk = -1, ans = 0;
            for (int i=0;i<len;i++)
            {
                if (i!=0)
                {
                    tmp.erase(s[i-1]);
                }
                while (tk+1<len && !tmp.count(s[tk+1]))
                {
                    tmp.insert(s[tk+1]);
                    tk++;
                }
                ans = max(ans, tk-i+1);

            }
            return ans;
    }
};
