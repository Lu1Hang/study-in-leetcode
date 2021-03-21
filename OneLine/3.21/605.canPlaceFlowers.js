/**
 * @param {number[]} flowerbed
 * @param {number} n
 * @return {boolean}
 */
var canPlaceFlowers = function(flowerbed, n) {
    var len = flowerbed.length;
    for (var i=0;i < len && n>0;)
    {
        if (flowerbed[i]==1)
        {
            i = i+2;           
        }
        else if (flowerbed[i+1] ==0 || i == len-1){
            i = i+2;
            n = n-1;
        }
        else i = i+3;
    }
    return n<=0;
};
