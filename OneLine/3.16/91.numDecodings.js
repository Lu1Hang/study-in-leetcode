/**
 * @param {string} s
 * @return {number}
 */
var numDecodings = function(s) {
    if(s.length <= 0)
    return 0;
    var count = 1;
    var next = 0;
    for (var i=0;i<s.length;i++)
    {
        var next2 = 0;
        if (s[i]!=='0'){
            next+= count;
            if (s[i]+s[i+1]<='26'){
                next2 = count;
            }
        }
        count = next;
        next = next2;
        if (count ==='0'){
            break;
        }
    }
    
    return count;
};
