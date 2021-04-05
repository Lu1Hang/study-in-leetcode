/**
 * @param {number[]} nums
 * @return {number}
 */
var lengthOfLIS = function(nums) {
    let len = nums.length;
    let dp = new Array(len+1).fill(1);
    for (let i=0;i<len;i++)
    {
        let res = 1;
        for (let j = 0; j<i;j++)
        if (nums[j] < nums[i])
        {
            res = Math.max(dp[j]+1 , res);
        }
        dp[i] = res;
    }
    return Math.max(...dp);
    // ...dp表示dp数组
};
