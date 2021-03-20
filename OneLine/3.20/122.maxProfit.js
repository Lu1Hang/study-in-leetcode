/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    var sum = 0;
    var len = prices.length;
    for (var i=1;i<len;i++)
    {
        sum += Math.max(0,prices[i]-prices[i-1]);
    }
    return sum;
};
