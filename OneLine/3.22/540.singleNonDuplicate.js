/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNonDuplicate = function(nums) {
    var len = nums.length;
    var ans = 0;
    for (var i=0;i<len;i++)
    {
        ans = ans^nums[i];
    }
    return ans;
};
