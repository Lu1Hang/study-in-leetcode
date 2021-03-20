/**
 * @param {number[][]} intervals
 * @return {number}
 */
var eraseOverlapIntervals = function(intervals) {
    var num = intervals.length;
    if (num==0)
        return 0;
    intervals.sort((a,b) => a[1]-b[1]);
    var right = intervals[0][1]; 
    var k =1;
    for (var i=1;i< num;i++)
    {
        if (intervals[i][0] >= right)
        {
            right = intervals[i][1];
            k++;
        }
    }
    return num-k;
};
