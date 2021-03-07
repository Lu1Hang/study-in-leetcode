/**
 * @param {number} num
 * @return {string}
 */
var intToRoman = function(num) {
    var val=[1000,900,500,400,100,90,50,40,10,9,5,4,1];
    var roma = ["M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"];
    var res = "";
    for (var i=0;i<13;)
    {
        if (num-val[i]>=0)
        {
            num = num-val[i];
            res = res+roma[i];
        }
        else i++;
    }
    return res;
};
