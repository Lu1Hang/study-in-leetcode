/**
 * @param {number[]} nums
 * @return {boolean}
 */
var canJump = function(nums) {
    let len = nums.length;
    let k = 0;
    for (let i=0;i<len-1;i++)
    {
        k = Math.max(k,nums[i]+i);
        if (k<=i)
            return false;
    }
    return k >= len-1;
};
