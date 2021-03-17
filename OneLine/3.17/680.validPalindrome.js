/**
 * @param {string} s
 * @return {boolean}
 */

var deleteChar=function(s,a,b){
    s = s.split('');
    for (var i=a,j=b; i<j; i++,j--)
    {
        if (s[i]!==s[j])
        return false;
    }
    return true;
}

var validPalindrome = function(s) {
    var left = 0,right = s.length-1;
    while (left < right){
        if (s[left]===s[right])
        {
            left++;
            right--;
        }
        else {
            if (deleteChar(s,left+1,right) || deleteChar(s,left,right-1))
                return true;
            else return false; 
        }
    }
    return true;
};
