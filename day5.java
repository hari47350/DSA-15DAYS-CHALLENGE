//problem binary search -LT 704

class Solution {
    public static int search(int[] nums, int target) 
    {
        return binarySearch(nums,target,0,nums.length-1);
    }
    public static int binarySearch(int[] nums,int target,int left,int right){
        int n=nums.length;
        
        if (left>right)
        { return -1;
        }
            int mid=left+(right-left)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]>target)
            {
                    return  binarySearch(nums,target,left,mid-1);
            }
            else 
            {
                return binarySearch(nums,target,mid+1,right);
            }
        
      
    }
    public static void main(String[] args)
    {
        int[] nums={-1,0,3,5,9,12};
        int target =9;
       int result=search( nums,  target) ;
        if(result !=-1)
        {
           System.out.println("target is  found"+result); 
        }
        else
        {
            System.out.println("element is not found");
        }
        
    }
}
 

//problem linked list cycle -LT 42

public class Solution {
    public class main {
         class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
    }
    public static boolean hasCycle(ListNode head) 
    {
        ListNode slow=head;
        ListNode fast =head;
        while(fast!=null&&fast.next!=null)
        {
           fast= fast.next.next;
            slow=slow.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {

    ListNode head=new ListNode(3);
    head.next=new ListNode(2);
     head.next.next=new ListNode(0);
      head.next.next.next=new ListNode(-4);
        int pos=0;
        if (pos != -1)
         {
            ListNode cycleNode = head;
            for (int i = 0; i < pos; i++) 
            {
                cycleNode = cycleNode.next;
            }
            head.next.next.next.next = cycleNode;  
        }

        System.out.println(hasCycle(head));
    }
}

// PROBLEM TRAPPING RAIN WATER -LT 42

import java.util.*;
class Solution {
    public static int trap(int[] height)
     {
        int n=height.length;
       
       int[] prefixsum=new int[n];
       int[] suffixsum  = new int[n];
       prefixsum[0]=height[0];
        
       for(int i=1;i<n;i++)
       {
        prefixsum[i]=Math.max(prefixsum[i-1],height[i]);
       }
       suffixsum[n-1]=height[n-1];
       for(int i=n-2;i>=0;i--)
       {
        suffixsum[i]=Math.max(suffixsum[i+1],height[i]);
       }
       int total=0;
       
     
       for(int i=0;i<=n-1;i++)
       {
        total+=Math.min(prefixsum[i],suffixsum[i])-height[i];
       }
        return total;
    }
    public static void main(String[] args)
    {
        int[] height = {4,2,0,3,2,5};
        System.out.println(trap(height));
    }
}
   