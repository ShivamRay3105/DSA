remove duplicates from array 

eg 1 
[0,0,1,1,1,2,2,3,3,4]

answer = 5 (unique numbers), nums = [0,1,2,3,4]

if nums.length ==1
return 1

else
initialize 2 pointers
left = 0 
right = 1

traverse until right < nums.length
    if(values at left and right are same)
        right++;
    else
        left increment by 1
        swap elements at left and right
return left+1 (actual number of unique elements)
