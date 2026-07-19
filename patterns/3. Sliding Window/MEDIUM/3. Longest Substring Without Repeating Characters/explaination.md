Input: s = "abcabcbb"
Output: 3

here we use hashset and sliding window 

add the elements which are new and also update the maxLength and increment right pointer
            if(right-left+1>maxLength) maxLength = right-left+1;

if the element is already present in the hashset
    remove the element present at left pointer
    increment left 

return maxLength
