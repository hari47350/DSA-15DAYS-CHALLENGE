//problem 167 sumof 2 input array is sorted

class Solution {
    public static int[] twoSum(int[] numbers, int target)
     {
        int n=numbers.length;
        int left=0;
        int right=n-1;
        while(left<right)
        {
         int sum=numbers[left]+numbers[right];
         if(sum==target)
         {

                    return new int[] {left+1,right+1};
         }
         else if (sum < target)
         {
               left++;
         }          
              else
              {
                right--;
              }  
            
        }
        return new int[] {};
    }
    public static void main(String[] args)
    {
        int[] numbers={2,7,11,15};
        int target=9;
        System.out.println(twoSum(numbers,target));
    }
}

//problem lc-3  longest substring without repeating characters 

import java.util.*;
class Solution {
    public static int lengthOfLongestSubstring(String s) 
    {
         int left=0,right=0,max=0;
         HashSet<Character> set=new HashSet<>();
         while(right<s.length())
         {
            if(!set.contains(s.charAt(right)))
            {
                set.add(s.charAt(right));
                right++;
                max=Math.max(set.size(),max);
            }
            else
            {
                set.remove(s.charAt(left));
                left++;
            }
         }

return max;
        
    }
    public static void main(String[] args)
    {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring( s)); 
    
    }
}

// problem lC - 35 search insert position 

class Solution {
    public static int searchInsert(int[] nums, int target) 
    {
      int n=nums.length;
      int left=0;int right=n-1;
      return binarySearch(nums,target,0,n-1);
    }
    public static int binarySearch(int[] nums,int target,int left,int right){
      if(left>right)
      {
        return left;
      }
      int mid=left+(right-left)/2;
      if(target==nums[mid])
      {
        return mid;
      }
      else if(nums[mid]>target)
      {
        return binarySearch(nums,target,left,mid-1);
      }
      else
      {
        return binarySearch(nums,target, mid+1,right);
      }
       
    }
    

    public static void main(String[] args)
    {
        int[] nums={1,3,5,6};
        int target=5;
        System.out.println(searchInsert(nums,target));
    }
}