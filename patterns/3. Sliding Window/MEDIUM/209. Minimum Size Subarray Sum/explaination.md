Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2

here we will use sliding window

left = 0
right = 0

we will also use 2 variables for length tracking

minLength = Integer.MAX_VALUE // default
currentSum = 0 // for each pass sum value

we will iterate over whole array 
    currentSum+=nums[right] // pass sum value

    while(currentSum >= target){
        - check minimum of minLength with current window length

        - subtract the nums value at left from currentSum to shrink and move the window to forward along with condition satisfied

        - increment left // for same reason as above
    }
    increment right

return minLength