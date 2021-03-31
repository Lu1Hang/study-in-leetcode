/**
 * var addBinary = function(a, b) {
 * return (BigInt('0b'+a) + BigInt('0b'+b) ).toString(2);
 * // 需要加上这个前缀 0b 来表明这是一个代表二进制数的字符串
 * };
 */
/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */

var addBinary = function(a, b) {
    let ans = "";
    let ca = 0;
    for(let i = a.length - 1, j = b.length - 1;i >= 0 || j >= 0; i--, j--) {
        let sum = ca;
        sum += i >= 0 ? parseInt(a[i]) : 0;
        sum += j >= 0 ? parseInt(b[j]) : 0;
        ans += sum % 2;
        ca = Math.floor(sum / 2);
    }
    ans += ca == 1 ? ca : "";
    return ans.split('').reverse().join('');
};
