class Solution {
public:
    bool isValid(string s) {
        int len = s.length();
        stack<char> st;
        if (s[0]=='}' || s[0]==']'|| s[0]==')')
        return false;
        for (int i=0;i<len;i++)
        {
            if (s[i]=='(' || s[i]=='[' || s[i]=='{')
                st.push(s[i]);
            else if (st.empty())
                return false;
            else if (s[i]==')')
            {
                if (st.top()=='(')
                st.pop();
                else return false;
            }
            else if (s[i]==']')
            {
                if (st.top()=='[')
                st.pop();
                else return false;
            }
            else if (s[i]=='}')
            {
                if (st.top()=='{')
                st.pop();
                else return false;
            }
          
            else return false;
        }
        if (st.empty())
        return true;
        else return false;
    }
   
};
