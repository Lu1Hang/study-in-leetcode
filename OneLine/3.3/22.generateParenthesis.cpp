class Solution {
public:
    vector<string> generateParenthesis(int n) {
        vector <string>res;
        fun(res,"",0,0,n);
        return res;
    }

    void fun(vector<string> &res ,string str ,int l, int r, int n){
        if (l>n || r>n ||r>l )
        return ;
        if (l==n &&r==n) {
            res.push_back(str);
            return;
        }
        fun(res, str+'(', l+1 ,r, n);
        fun(res, str+')', l, r+1, n);
        return ;
    }
};
