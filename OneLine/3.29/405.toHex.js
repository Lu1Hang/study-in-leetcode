/**
 * @param {number} num
 * @return {string}
 */
var toHex = function(num) {
    if (!num )return '0';
    const tmp = '0123456789abcdef';
    let res = '';
    while (num !=0 && res.length < 8 ){
        res = tmp[num& 15] +res;
        // &是取余符号 CPU采用如下方法计算余数（注意，该方法只对2的N次方数系有效）：X & (2^N - 1)
        num = num >> 4;
    }
    return res;
};
