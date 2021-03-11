/**
 * @param {number} x
 * @return {number}
 */
var mySqrt = function(x) {
    var left = 0,right = x,ans = 0;
    while (left<=right)
    {
        var mid = (left+right)>>1;
        if (mid*mid> x)
        {
            right = mid-1;
        }
        else
        {
            ans = mid;
            left =mid+1;
        } 
    }
    return ans;
};
