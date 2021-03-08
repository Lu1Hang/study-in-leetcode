/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    var minn = Infinity ,ans = 0;
    if (!prices || prices.length==0)return 0;
    for (var i=0;i<prices.length;i++)
    {
        minn = Math.min(minn,prices[i]);
        ans = Math.max(ans,prices[i]-minn);
    }
    return ans;
};
