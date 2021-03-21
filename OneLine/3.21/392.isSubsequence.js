/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isSubsequence = function(s, t) {
    var len = s.length;
    for (var i=0;i<len;i++)
    {
        var index = t.indexOf(s[i]);
        if (index>=0)
            t = t.slice(index+1);
        else    
            return false;
    }
    return true;
};


