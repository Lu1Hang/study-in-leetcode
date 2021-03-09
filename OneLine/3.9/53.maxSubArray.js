/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    const dp = nums.slice();
    for(let i=1 ;i<nums.length;i++) 
    {
        dp[i]=Math.max(dp[i] ,nums[i]+dp[i-1]);
    }
    return Math.max.apply(null, dp);
};
