/**
 * @param {string} text1
 * @param {string} text2
 * @return {number}
 */
var longestCommonSubsequence = function(text1, text2) {
    let len1 = text1.length;
    let len2 = text2.length;
    let i=0,j=0;
    let dp = new Array(len1+1).fill(0).map(()=> new Array(len2+1).fill(0));
    for (i=1;i<=len1;i++)
    {   
        let res = text1[i-1];     
        for (j=1;j<=len2;j++)
        {
            let ans = text2[j-1];
            if (res ===ans)
            dp[i][j] = dp[i-1][j-1] +1;
            else {
                dp[i][j] = Math.max(dp[i][j-1] ,dp[i-1][j]);
            }
        }
        }
    return dp[len1][len2];
};
