/**
 * @param {number} n
 * @return {number}
 */ 
const isprime = (num)=>{
        for (var i=2; i*i <=num;i++)
        {
            if (num%i==0)
            return false;
        } 
        return true;
    }
   
var countPrimes = function(n) {
    let ans = 0;
    for (let i = 2;i<n;i++)
    {
        ans+= isprime(i);
    }
    return ans;
};




