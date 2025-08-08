//problem -456 132 pattern 
class Solution {
    public static boolean find132pattern(int[] nums)
     {
        int n=nums.length;
        if(n<3)
        {
            return false;
        }
        Deque<Integer> stack = new ArrayDeque<>(); 
        int second = Integer.MIN_VALUE;
         for (int i = n - 1; i >= 0; i--)
          {
            if (nums[i] < second) return true;
            while (!stack.isEmpty() && nums[i] > stack.peek())
             {
                second = stack.pop(); 
              }
          stack.push(nums[i]);
        }
        return false;
     }
    public static void main(String[] args)
    {
        int[] nums={1,2,3,4};
        System.out.println(find132pattern(nums));
    }
}

//problem -132 partitioning palindrome ii

import java.util.*;
class Solution {
    public static int minCut(String s) 
    {
        int n=s.length();
       Integer[] dp = new Integer[n];
        return fun(0, s, dp) - 1; 
    }
    public static boolean isPalindrome(int i,int j,String s)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static int fun(int i,String s,Integer[] dp){
   int n=s.length();
      if( i==n)
      {
        return 0;
      }
      if (dp[i] != null) return dp[i];

      int mincost=Integer.MAX_VALUE;
  
      for(int j=i;j<n;j++)
      {

        if( isPalindrome(i,j,s))
        {
           int cost=1+fun(j+1,s,dp);
             mincost=Math.min(mincost,cost);
        }
      }
        return dp[i]=mincost;
      }
        
    
  public static void main(String[] args) 
  {
        String s = "aab";
        System.out.println(minCut(s));
  }
     
}

// problem -92  reverse linked list ii


//  class ListNode {
//      int val;
//      ListNode next;
//       ListNode() {}
//       ListNode(int val) { this.val = val; }
//       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//   }
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
         if (head == null || left == right) return head;

       
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        
        ListNode curr = prev.next;
        ListNode next = null;
        ListNode tail = curr; 

        for (int i = 0; i < right - left + 1; i++) {
            next = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = next;
        }

        
        tail.next = curr;

        return dummy.next;
    }

    
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();

}
public static void main(String[] args)
{
    ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution sol = new Solution();
        head = sol.reverseBetween(head, 2, 4);
        printList(head);
}
}

