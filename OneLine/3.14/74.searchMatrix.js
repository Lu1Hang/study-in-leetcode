/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function(matrix, target) {
    let arr = [];
    for (let i in matrix)
    {
        arr = arr.concat(matrix[i]);
    }
    const binarySearch = (arr, target) =>{
        var left = 0,right = arr.length-1;
        while (left <= right)
        {
            let mid = left +( (right-left) >> 1);
            if (arr[mid] === target){
                return mid;
            }else if (arr[mid] < target)
            {
                left = mid+1;
            }
            else right = mid-1;
        }
        return -1;
    }
    
   if (binarySearch(arr,target)!==-1){
       return true;
   }
   else return false;
};
