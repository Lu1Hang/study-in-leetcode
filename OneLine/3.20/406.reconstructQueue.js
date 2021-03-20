/**
 * @param {number[][]} people
 * @return {number[][]}
 */
var reconstructQueue = function(people) {
    var ans = [];
    if (!people) return [];
    people.sort((a,b) => {
        if (a[0]==b[0])
        return a[1]-b[1];
        else return b[0]-a[0];
    })
    people.forEach(item =>{
        ans.splice(item[1],0,item);
    })
    //splice 添加或删除数组元素
    return ans;
};
