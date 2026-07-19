initialize two pointers 

left = 0
right = n-1

here we will start finding the container from pointers of left and right , to make the a square container

default maxArea = 0

now traverse through whole height array while left<right

    calculate currentArea , length = min(left and right position values) 
                        breadth = right - left

    replace value of maxArea -> max(maxArea, currentArea)

    if(height[left] < height[right]) left++
    else right++

return maxArea