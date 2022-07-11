//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//A subarray is a contiguous part of an array.

class Subarray 
{
    public int maxSubArray(int[] nums) 
    {
        
        int sum =0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++)
        {
            sum = sum + nums[i];
            maxSum = Math.max(maxSum, sum);{
                if(sum<0)
                {
                    sum=0;
                }
            }
        }
        return maxSum;
        
        
    }
}