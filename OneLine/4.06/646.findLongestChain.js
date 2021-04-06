/**
 * @param {number[][]} pairs
 * @return {number}
 */
var findLongestChain = function(pairs) {
    let len = pairs.length;
    if (len===0) return 0;
    let dp = new Array(len+1).fill(1);
    pairs.sort((a,b) => a[0]-b[0]);
    for (let i=0;i<len;i++)
    {
        let res = dp[i];
        for (let j= 0;j < i;j++)
        {
            if (pairs[i][0] > pairs[j][1])
            res = Math.max(res, dp[j]+1);
        }
        dp[i] = res;
    }
    return Math.max(...dp);
};


