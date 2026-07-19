Input: numbers = [2,7,11,15], target = 9
Output: [1,2]

here array is already sorted 
we need to find positions of values which sums up to target

given that 
2 <= numbers.length <= 3 * 104
-1000 <= numbers[i] <= 1000
numbers is sorted in non-decreasing order.
-1000 <= target <= 1000

1st thing., array length is always >= 2

that means.,
initialize two pointers

left = 0
right = 1 

initialize resulting array
int[] result = new int[2];

traverse while right reaches end of array 
    if (sum of values at left and right == target)
         result[0] = left+1;
        result[1] = right+1;
        break;
    else if (sum < target) left++
    else right++

return result