/**
 * @param {string} s
 * @return {string}
 */
var reverseVowels = function(s) {
    var str = ['a','e','i','o','u','A','E','I','O','U'];
    var i=0,j=s.length-1;
    s = s.split('');
    //字符串分割维字符串数组
    while (i<j){
        if (str.indexOf(s[i])===-1)
        {
            i++;
            continue;
        }
        if (str.indexOf(s[j])===-1)
        {
            j--;
            continue;  
        }
        [s[i],s[j]] = [s[j],s[i]];
        i++;
        j--;
    }
    return s.join('')
};
