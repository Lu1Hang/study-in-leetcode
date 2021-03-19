/**
 * @param {number[]} g
 * @param {number[]} s
 * @return {number}
 */
var findContentChildren = function(g, s) {
    g.sort((a,b) => a-b);
    s.sort((a,b) => a-b);
    var count =0, sumg = g.length,sums = s.length;
    for (let i=0,j=0;i<sumg&& j <sums;i++,j++)
    {
        while (g[i] > s[j] && j<sums)j++;
        if (j<sums)count++;
    }
    return count;
};
