/**
 * @param {number} n
 * @return {number}
 */
var numSquares = function(n) {
    let mem=[];
    const getcount =(num)=>{
        if (num<=3)return num;
        if (mem[num])return mem[num];
        let k = Math.floor(Math.sqrt(num));
        for (var i=k; i>=2; i--){
            const res = getcount(num-i*i);
            mem[num] = Math.min(res+1 , mem[num] || Number.MAX_VALUE);
        }
        return mem[num];
    }
    return getcount(n);
};
