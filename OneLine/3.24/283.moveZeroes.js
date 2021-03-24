/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
    var id = 0;
    for (var num in nums){
        if (nums[num]!=0){
            nums[id++] = nums[num];
        }
    }
    while (id <nums.length){
        nums[id++] = 0;
    }
    return nums;
};
