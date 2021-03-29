/**
 * @param {number} n
 * @return {number}
 */
var trailingZeroes = function(n) {
    if (n < 5)
    return 0;
    else {
    let k = Math.floor(n/5 )
    return k + trailingZeroes(k);
    }
};
