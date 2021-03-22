/**
 * @param {character[]} letters
 * @param {character} target
 * @return {character}
 */
var nextGreatestLetter = function(letters, target) {
    var right = letters.length-1;
    var left = 0;
    if (target < letters[left] || target >= letters[right])
        return letters[left];
    while (left < right){
        var mid =  Math.floor((right + left) /2);
        if (letters[mid] <= target){
            left = mid + 1;
        }
        else {
            right = mid;
        }
    }
    return letters[left];
};
