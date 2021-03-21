/**
 * @param {number[]} nums
 * @return {boolean}
 */
var checkPossibility = function(nums) {
    var flag = 0;
    for (let i=1;i<nums.length  ;i++)
    {
        if (nums[i] >= nums[i-1] )
        continue;
            flag++;
            if (i-2>=0 && nums[i-2] > nums[i]){
                nums[i] = nums[i-1];
            }
            else nums[i-1] = nums[i];
    }
    if (flag>1)
        return false;
    else return true;
};
