/**
 * @param {number} num
 * @return {boolean}
 */
var isPerfectSquare = function(num) {
    const k = Math.floor(Math.sqrt(num));
    return k *k ===num;
};
