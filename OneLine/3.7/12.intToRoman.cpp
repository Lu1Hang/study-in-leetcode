class Solution {
public:
    int val[13]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    string roma[13] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    string res = "";
    string intToRoman(int num) {
        for (int i=0;i<13;i++)
        {
            while (num>=val[i])
            {
                num = num-val[i];
                res = res+ roma[i];
            }
        }
        return res;
    }
};
