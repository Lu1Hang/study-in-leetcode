/**
 * @param {number[]} nums
 * @return {number}
 */
var r = function(nums, a, b){
    let num1 = 0,num2 = 0;
    for (let i=a;i<b;i++)
    {
        let cur = Math.max(num1+ nums[i] ,num2);
        num1 = num2;
        num2 = cur;
        
    }
    return num2;
}

var rob = function(nums) {
    let len = nums.length;
    if (len===0) return 0;
    if (len===1) return nums[0];
    let max1 = r(nums, 0,len-1);
    let max2 = r(nums,1,len);
    return Math.max(max1,max2);
};
