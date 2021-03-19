/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var swap = function(nums,a,b){
    [nums[a],nums[b]] = [nums[b],nums[a]];
}

var find = function(nums,left,right ){
    var i= left ,j = right;
    var target = nums[left];
    //标记值在左边 从右边开始比较
    while (i<j){ 
        while (nums[j] <= target && i<j) j--;
        nums[i]=nums[j];
        while (nums[i] >target && i<j) i++;
        nums[j]=nums[i];
    }
    nums[i] = target;
    return i;
}

var findKthLargest = function(nums, k) {
    var left = 0,right = nums.length-1;
    //k = nums.length -k-1;
    var cur = find(nums,left,right);
    while (cur !==k-1){
        if (cur >k-1)
            cur = find(nums,left,cur-1);
        else 
            cur = find(nums, cur+1,right);
    }
   return nums[k-1];
};




