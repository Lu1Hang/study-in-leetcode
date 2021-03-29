/**
 * @param {number} columnNumber
 * @return {string}
 */
var convertToTitle = function(columnNumber) {
    if (!columnNumber)
    return '0';
    const res = [];
    while (columnNumber )
    {
        columnNumber--;
        let m = columnNumber%26;
        res.unshift (String.fromCharCode(m+65));
        // fromCharCode 是把 Unicode 转化为字符串
        // unshift 向数组开头添加一个元素
        columnNumber = Math.floor(columnNumber/26);
    }
    return res.join('');
};
