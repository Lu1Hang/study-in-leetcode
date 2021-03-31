/**
 * @param {number[]} nums
 * @return {number}
 */
var minMoves2 = function(nums) {
    nums.sort((a,b) => a-b);
    let sum = 0;
    let i=0, j= nums.length-1;
    while (i <=j){
        sum = sum + nums[j] - nums[i];
        j--;
        i++;
    }
    return sum;
};
