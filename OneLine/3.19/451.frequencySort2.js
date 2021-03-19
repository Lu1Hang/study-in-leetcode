/**
 * @param {string} s
 * @return {string}
 */
var frequencySort = function(s) {
    var arr = s.split('');
    var obj = arr.reduce((prev, item ,index) => {
        prev[item]==undefined ? prev[item]=1 : prev[item]+=1;
        return prev;
    },{})
    var sortArr = Object.values(obj).sort((a,b) => b-a);
    var str = '';
    sortArr.forEach(item=> {
        for (var i in obj){
            if (obj[i]==item){
                while (item--)
                {
                    str = str+i;
                }
                obj[i]=0;
                break;
            } 
          
        }
    })
    return str;
};



