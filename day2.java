//problem leetcode 121 best time to buy and sell the stocks
import java.util.*;
class Solution {
    public static int maxProfit(int[] prices)
     {
        if(prices==null||prices.length<2)
        {
            return 0;
        }
         int profit=0;
        int min=prices[0];
         for(int i=0;i<prices.length;i++)
         {
            int cost=prices[i]-min;
            profit=Math.max(profit,cost);
            min=Math.min(prices[i],min);
           
         }
        return profit;
    }
 public static void main(String[] args)
 {
    int[] prices={7,1,5,2,6,4};
    
    System.out.println(maxProfit( prices));
 }
}
----------------------------------------------------------------------------------------------------------------------------------------
//leetcode 238 product of array expect itself
class Solution {
    public static int[] productExceptSelf(int[] nums)
     {
        int n=nums.length;

      int[] left=new int[n];
      left[0]=1;
        for(int i=1;i<n;i++)
        {
            left[i]=nums[i-1]*left[i-1];

        }
        int[] right=new int[n];
      right[n-1]=1;
        for(int i=n-2;i>=0;i--)
        {
            right[i]=nums[i+1]*right[i+1];

        }
        int[] answer=new int[n];
        for(int i=0;i<n;i++)
        {
            answer[i]=left[i]*right[i];
        }
        
     return answer;   
    }
    public static void main(String[] args)
    {
        int[] nums={1,2,3,4};
        productExceptSelf(nums);
        for(int num:nums){
        System.out.println(num);
        }
    }
}
----------------------------------------------------------------------------------------------------------------------------------------
// problem check palindrome or not(lc-125)
class Solution {
    public static boolean isPalindrome(String s ) 
    {
        StringBuilder cleaned=new StringBuilder();
        for(char c: s.toCharArray())
        {
             if(Character.isLetterOrDigit(c))
             {
                cleaned.append(Character.toLowerCase(c));
             }
        }
        
       
       int left=0;
       int right=cleaned.length()-1;
        while(left<right){
        if(  cleaned.charAt(left)!=cleaned.charAt(right))
        {
            return false;
        }
        left++;
        right--;
        }
   return true;        

    }
    public static void main(String[] args)
    {
        String s="A man, a plan, a canal: Panama";
    
          System.out.println( isPalindrome(s));
        
    }
}   

// ------------------------------------------------------------------------------------------------------

