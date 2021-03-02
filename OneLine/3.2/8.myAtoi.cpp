class Solution {
public:
    int myAtoi(string s) {
        int len = s.length();
        long long ans = 0; 
        bool flag = true;
        bool ff = false;
        bool num = false;
        for (int i=0;i<len;i++)
        {
            if ( (s[i]>='0' &&s[i]<='9' )|| s[i]=='+' || s[i]=='-' || s[i]==' ')
            {
                if (s[i]==' ')
                {
                    if (ff ==true) break;
                    else continue; 
                }
                if (s[i]=='-' && ff ==false )
                {
                    flag = false;
                    ff = true;
                }
                else if (s[i]=='+' && ff == false)
                {
                    flag = true;
                    ff = true;
                }
                else if (s[i]>='0' && s[i]<='9' )
                {
                    //if (flag)
                    ans = ans *10+( s[i]-'0');
                   //else 
                  //  ans = -ans*10-(s[i]-'0');
                    ff = true;
                    num = true;
                }
                else break;
            }
            else break;
        if (ans >92147483647)
        break;
        else if (ans<- 92147483648)
        break;        
        }
        if (flag ==false)
        ans = -ans;
        if (ans >2147483647)
        return 2147483647;
        else if (ans<- 2147483648)
        return -2147483648;
        else return ans;
    }
};
