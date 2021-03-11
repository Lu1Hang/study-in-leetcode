/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function(haystack, needle) {
    if (needle==="" || haystack===needle)return 0;
    var len1 = haystack.length;
    var len2 = needle.length;
    if (len1 < len2) return -1;
    for (let i=0;i<len1;i++){
        if (needle[0]===haystack[i]){
            let str = haystack.slice(i,i+len2);
            if (str===needle)
            return i;
        }
    }
    return -1;
};

 
