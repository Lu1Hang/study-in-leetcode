/**
 * @param {number[]} nums
 * @param {number} S
 * @return {number}
 */
var findTargetSumWays = function(nums, S) {
    if (nums== null || nums.length==0) return 0;
    var sums = 0;
    nums.forEach(num => sums+= num);
    if (sums < S || (S+ sums)%2==1) return 0;
    var p = (S+sums) >> 1;
    var dp = new Array(p+1).fill(0);
    dp[0] = 1;
    nums.forEach(num =>{
        for (var i=p; i>=num ;i--){
            dp[i]+= dp[i-num];
        }
    })
    return dp[p];
};
