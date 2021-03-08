/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    var num=[];
    num[0]=1;
    num[1]=1;
    for (let i=2;i<n+2;i++)
    {
        num[i]=num[i-1]+num[i-2];
    }
    return num[n];
};
