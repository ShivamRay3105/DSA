1st approach with high time and space complexity
we will use prefix and postfix both array, but only initialize according to the condition 

eg :
[-2, 0, 3, -5, 2, -1]

here, we will be given range of left and right 
and in that, we need to cover all the values inclusive left and right, summation of all the values should be returned

# so naive and complicated approach

firstly we need to initialize the constructor
   int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    } 

simple as that

now, in the sumRange function, left and right will be given 

    if(left > 0 ){
        <!-- we will use postfix approach for this  -->
        create postfix[] array and initialize values....

        if( right == nums.length-1 ){
             <!-- simply means range of whole array  -->
            return postfix[left];
        <!-- as the left most value will be the sum of whole array  -->
        }
        else {
         <!-- if(right<nums.length-1)\ -->
         <!-- the right value is not the last position/value of the array -->
         return (postfix[left] - postfix[right+1])
        } else {
            <!-- left == 0 -->
            <!-- means we have to use the prefixArr[] -->
            
            initialize prefix[] ...
            return prefix[right];

            <!-- as the sum of whole given range will be at the give 'right' position -->

        }
    }


# Now the optimized and simple solution 

we will use prefixSum[] 1 array only

Initialize array in the constructor only
 int[] prefixSum;
    public NumArray(int[] nums) {
        prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefixSum[i] = nums[i] + prefixSum[i-1];
        }
    }

 because we need only 1 array for solving our solution, we can create it at the object creation time once only as constructor always runs when object is created

now int the sumRange function:

    int sumRange(int left, int right){
        if(left == 0)
            return prefixSum[right];
        return prefixSum[right] - prefixSum[left-1];
    }

3 lines only? yehh,,
if the left is 0, it means the prefixSum array will have the sum of given range at the right position only, 
it will include sum of every values between left and right inclusive of both 

if left > 0
we can simple return the subtraction of the right positioned value and left-1, because left-1 will always be there and left > 0
and it will include the sum range by subtracting the left most not required sum, which is left-1 position subtracted from value of right

these both operation will be happen in the prefixSum array only

