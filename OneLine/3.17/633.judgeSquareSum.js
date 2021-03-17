/**
 * @param {number} c
 * @return {boolean}
 */
var judgeSquareSum = function(c) {
    var s = Math.floor(Math.sqrt(c));
    var left = 0,right = s+1;
    while (left <= right){
        if ((left*left + right*right) == c)
            return true;
        else if (left*left + right*right >c){
            right--;
        }
        else left++;
    }
    return false;
};
