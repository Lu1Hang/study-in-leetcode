/**
 * @param {number[][]} points
 * @return {number}
 */
var findMinArrowShots = function(points) {
    var len = points.length;
    if (len==0) return 0;
    points.sort((a,b) => a[1]-b[1]);
    var right = points[0][1];
    var ans = 1;
    for (var i=0;i<len;i++)
    {
        if (points[i][0]> right)
        {
            ans++;
            right = points[i][1];
        }
    }
    return ans;
};
