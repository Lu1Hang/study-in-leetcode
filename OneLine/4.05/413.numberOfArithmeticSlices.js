/**
 * @param {number[]} nums
 * @return {number}
 */
var numberOfArithmeticSlices = function(nums) {
    let len = nums.length;
    if (len ===0 )return 0;
    let dp = new Array(len+1).fill(0);
    //let aa = new Array(len+1).fill(0);
    let sum = 0;
    for (let i=2;i<len;i++)
    {
        if (nums[i]-nums[i-1] === nums[i-1]-nums[i-2])
        dp[i]=dp[i-1]+1;
    }
    for (let i=2;i<len+1;i++)
    {
        sum = sum+dp[i];
    }
    return sum;
};
