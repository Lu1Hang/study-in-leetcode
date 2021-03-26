/**
 * @param {string} expression
 * @return {number[]}
 */
var diffWaysToCompute = function(expression) {
    var result = [];
    for (var i=0;i<expression.length;i++)
    {
        var x = expression.charAt(i);
        if (x ==='*' || x==='-' || x==='+'){
            var left = diffWaysToCompute(expression.substring(0,i));
            //能够将运算符与数字分开
            var right = diffWaysToCompute(expression.substring(i+1));
            for (var l =0 ;l<left.length ;l++)
            for (var r =0 ;r<right.length ;r++){
                if (x==='+')
                result.push(left[l]+right[r]);
                else if (x==='-')
                result.push(left[l]-right[r]);
                else 
                result.push(left[l]*right[r]);
            }
        }
    }
    if (result.length==0)
    result.push(parseInt(expression))
    return result;
};

