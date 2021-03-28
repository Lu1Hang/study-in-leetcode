/**
 * @param {number} num
 * @return {string}
 */
var convertToBase7 = function(num) {
    let next = Math.abs(num);
    let res = '';
    while (next>=7)
    {
        res = next % 7 + res;
        next = next /7 |0;
        // |0 表示去掉小数部分 或者解释为 or运算符 向下取整
    }
    res = next +res;
    if (num <0) 
    return '-'+res;
    return res;
};

