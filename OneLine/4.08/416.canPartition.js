/**
 * @param {number[]} nums
 * @return {boolean}
 */
var canPartition = function(nums) {
    let len = nums.length;
    if (len < 2)return false;
    let sum = 0;
    let maxNum = 0;
    for (let i=0;i<len;i++)
    {
        sum += nums[i];
    }
    maxNum = Math.max(...nums);
    let target = Math.floor(sum/2);
    if (sum&1 ) return false;
    if (target < maxNum) return false;
    let dp = new Array(len+1).fill(0).map(()=> new Array(target+1 ,false));
    for (let i=0;i<len;i++)
    {
        dp[i][0] = true;
    }
    dp[0][nums[0]] =true;
    for (let i=1; i<len;i++)
    {
        const num = nums[i];
        for (let j=1 ; j<=target;j++)
        {
            if (j>=num){
                dp[i][j] = dp[i-1][j] | dp[i-1][j-num];
                // | 或运算符
            }
            else dp[i][j] = dp[i-1][j];
        }
    }
    return dp[len-1][target];
};


