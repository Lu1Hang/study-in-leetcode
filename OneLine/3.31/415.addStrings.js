/**
 * @param {string} num1
 * @param {string} num2
 * @return {string}
 */
var addStrings = function(num1, num2) {
    let ans = [];
    let sum = 0;
    let a = num1.length -1 , b = num2.length-1 ;
    while (a >=0|| b>=0 || sum!=0)
    {
        const x = num1.charAt(a) - '0';
        const y = num2.charAt(b) - '0';
        sum = sum + x + y;
        ans.push(sum %10);
        sum = Math.floor(sum/10);
        a-- ,b--;
    }
    return ans.reverse().join('');
};
