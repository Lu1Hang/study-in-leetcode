/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var permuteUnique = function(nums) {
    nums.sort((a,b)=> a-b)
    let result = [],path = [],way = [];
    let re = (i) =>{
        if (path.length === nums.length){
            result.push([...path]);
            return;
        }
        for (; i<nums.length;i++)
        {
            if (way[i])continue;
            way[i]= true;
            path.push(nums[i]);
            re(0);
            path.pop();
            way[i]=false;
            while (nums[i+1] === nums[i])i++;
        }
    }
    re(0);
    return result;
};


