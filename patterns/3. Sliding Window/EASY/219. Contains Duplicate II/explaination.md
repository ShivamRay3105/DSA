we will use HashSet 

window length max size is k+1, as absolute indexes difference <= k

// initialize two pointers of sliding window
left = right = 0;

iterate whole array 

    // maintain the size of window
    if the size of the window is longer than k+1
        then remove it from set 
        increment left

    if(set.contains(nums[right])) return true
    // above line means, we found duplicate  within window


    set.add(nums[right]) // add the current value to set

return false