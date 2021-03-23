/**
 * @param {string} S
 * @return {number[]}
 */
var partitionLabels = function(S) {
    var len = S.length;
   // var last = new Array(26);
   // const code = 'a'.codePointAt(0);
   // codePointAt 返回指定索引处的字符 码点的十进制值
    const partition = [];
    var start = 0, end = 0;
    for (var i =0; i<len;i++)
    {
        end = Math.max(end , S.lastIndexOf(S[i]));
        if (i==end){
            partition.push(end - start +1);
            start = end+1;
        }
    }
    return partition;
};


/****

/**
 * @param {string} S
 * @return {number[]}
 */
var partitionLabels = function(S) {
    var len = S.length;
    var last = new Array(26);
    const code = 'a'.codePointAt(0);
    for (var i=0;i<len; i++)
    {
        last[S.codePointAt(i) - code] = i;

    }
    const partition = [];
    var start = 0, end = 0;
    for (var i =0; i<len;i++)
    {
        end = Math.max(end , last[S.codePointAt(i) - code]);
        if (i==end){
            partition.push(end - start +1);
            start = end+1;
        }
    }
    return partition;
};

****/
