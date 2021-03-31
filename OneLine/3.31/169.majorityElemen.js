/**
 * @param {number[]} nums
 * @return {number}
 */
/**
 var majorityElement = function(nums) {
    nums.sort((a,b) => a-b);
    return nums[Math.floor(nums.length/2)];
};
 * 
 */
var majorityElement = function(nums) {
    // 摩尔投票法
    let ans = nums[0];
    let count = 1;
    for (let i=1;i<nums.length ;i++)
    {
        if (count ==0 )
        {
            ans = nums[i];
        }
        if (ans==nums[i])
        {
            count++;
        }
        else count--;
    }
    return ans;
};
