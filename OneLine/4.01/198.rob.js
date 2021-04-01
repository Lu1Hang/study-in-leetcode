/**
 * @param {number[]} nums
 * @return {number}
 */
var rob = function(nums) {
    let num1 = 0,num2 = 0;
    for (let i=0;i<nums.length ;i++)
    {
        let cur = Math.max(num1+ nums[i] ,num2);
        num1 = num2;
        num2 = cur;
        
    }
    return num2;
};
