/**
 * @param {number} n
 * @return {boolean}
 */
/**
 var isPowerOfThree = function(n) {
    return n>0 && (1162261467 %n ==0);
};
 */

var isPowerOfThree = function(n) {
    if (n<1)return false;
    while (n%3==0)
    n = n/3;
    return n==1;
};
