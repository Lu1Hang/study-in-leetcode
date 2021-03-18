/**
 * @param {string} s
 * @param {string[]} dictionary
 * @return {string}
 */
var findLongestWord = function(s, d) {
    if (!d) return'';
    d = d.sort();
    var longest = '';
    for (let  i=0;i<d.length;i++)
    {
        var cur = d[i];
        if (find(s,cur) && cur.length >longest.length)
        {
            longest = cur;
        }
    }
    return longest;
};

var find = function(s,str){
    var i=0,j = 0;
    while (j<s.length){
        if (str[i]===s[j]){
            i++;
            j++;
        }
        else j++;
    }
    if (i=== str.length)return true;
    else return false;
}
