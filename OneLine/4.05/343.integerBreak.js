/**
 * @param {number} n
 * @return {number}
 */
var integerBreak = function(n) {
    let dp = new Array(n+1).fill(0);
    if (n===2) return 1;
    for (let i=2;i<=n;i++)
    {
        let res = 0;
        for (let j=1;j<i;j++)
        {
            res = Math.max(res,dp[i-j]*j, j*(i-j));
        }
        dp[i] =res;
    }
    return dp[n];
};



