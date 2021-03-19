/**
 * @param {string} s
 * @return {string}
 */
var frequencySort = function(s) {
    var map = {};
    //for in 遍历获取的是对象的键名 遍历整个对象的原型链
    //for of 遍历获取的是对象的键值 遍历当前对象不会遍历原型链 
    for (let si of s){
        map[si] = (map[si]|| '')+si;
    }
    return Object.values(map).sort((a,b) => a.length - b.length).reduce((p,c) => c+p,'');
};

