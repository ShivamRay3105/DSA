A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

convert the string to lower case and also remove all the special characters or seperators 
( characters which are not a-z or 0-9) replace them with "" empty string

then start from left and right 
while(left<=right)
    if(compare all the characters at left and right)
        // if they are not same
        return false
    left++
    right--

// found every corresponding characters at left and right position to be same     
return true