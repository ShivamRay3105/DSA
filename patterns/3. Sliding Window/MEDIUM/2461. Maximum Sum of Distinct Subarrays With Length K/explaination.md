we will use 4 variables
left = right = 0

Long maxSum = Long currentWindowSum = 0L

iterate through whole array via right pointer

    while( right < nums.length){
        // now if the window size == K || set contains the current element
        while(above true){
            remove the element from set
            subtract it from currentWindowSum
            increment left
        }
        add current number to set 
        add current number to CurrentSum
        check if window size is k {
            max(currentSum ,maxSum )
        }
        increment right
    }

return maxSum