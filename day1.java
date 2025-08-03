//problem 1 leetcode twosum
class Solution
 {
    public static int[] twoSum(int[] nums, int target) 
    {
       
       
        for(int i=0;i<nums.length;i++)
        {
            for(int j=1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==(target))
                {
                    
                    
                    return new int[] {i,j} ;
                }
                
            }
        }
        
       return new int[]{};
       
    }
    public static void main(String[] args)
    {
        int[] nums={2,7,11,15};
        System.out.println(twoSum(nums,9));
    }
    
} 

------------------------------------------------------------------------------------------------------------------------------------------

//problem leetcode 53 maximum subarray
class Solution {
    public static int maxSubArray(int[] nums)
     {
        int n=nums.length;
        int max=nums[0];
        int currentsum=nums[0];
        for(int i=1;i<n;i++)
        {
                currentsum=Math.max(nums[i],currentsum+nums[i]);
                 max=Math.max(max,currentsum);
       }
            
        
        return max;
    }
     public static void main(String[] args)
    {
     int[] nums={-2,1,-3,4,-1,2,1,-5,4};
     int result=maxSubArray(nums);
     System.out.println(result);
    }
}

------------------------------------------------------------------------------------------------------------------------------------------
problem 26 remove duplicates from sorted array
class Solution {
    public static int removeDuplicates(int[] nums)
     {
        int n=nums.length;
        int i=0;
            for(int j=1;j<n;j++)
            {
                if(nums[j]!=nums[i])
                {
                   i++;
                   nums[i]=nums[j];
                }
            
        }
        return i+1;
    }
    public static void main(String[] args)
    {
        int[] nums={1,1,2};
        System.out.println( removeDuplicates(nums));
    }
}