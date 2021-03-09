/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function(nums) {
    let zero = -1;
    let two = nums.length;
    let i = 0;
    while (i<two)
    {
        if (nums[i]=== 1)
        {
            i++;
        }
        else if (nums[i]===0)
        {
            zero++;
            [nums[i],nums[zero]] = [nums[zero],nums[i]];
            i++;
        }
        else {
            two--;
            [nums[i],nums[two]] = [nums[two],nums[i]];
        }
    }
    return nums;
};
