/**
 * @param {number[]} nums
 * @return {number}
 */
var wiggleMaxLength = function(nums) {
    let len = nums.length;
    if (len<2)return len;
    let up = 1,down =1;
    for (let i=1; i< len;i++)
    {
        if (nums[i] > nums[i-1])
        up = Math.max(down+1 , up);
        else if (nums[i] < nums[i-1])
        down = Math.max(up+1 ,down);
    }
    return Math.max(up,down);
};
