/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    let left= [] ,right =[] , ans = [];
    left[0]= 1;
    const len = nums.length;
    right[len-1] = 1;
    for (let i=1;i< len ;i++)
    {
        left[i] = left[i-1] * nums[i-1];
    }
    for (let i= len-2; i>=0 ;i--)
    {
        right[i] = right[i+1]*nums[i+1];
    }
    for (let i=0;i<len;i++)
    {
        ans[i] = left[i] * right[i];
    }
    return ans;
};
