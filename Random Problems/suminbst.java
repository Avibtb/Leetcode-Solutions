/***
 * You are given with a BST and an integer k. You need to find the sum of k smallest elements of the BST.
Input format :
Line 1 :  Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Line 2:integer k
Output Format :
sum of k smallest elements
Example:

Sample Input 1:
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
2
Sample Output 1:
7
Sample Input 2:
8 7 10 2 -1 9 13 -1 -1 -1 -1 -1 -1
2
Sample Output 1:
9
*/

import java.util.*;

class Count{
    int count = 0;
}

public class suminbst {
    public static int helper(BinaryTreeNode<Integer> root, int k, Count count)
    {
        if(root == null)
            return 0;
        if(count.count>k)
            return 0;
        int ans = helper(root.left,k,count);
        if(count.count >= k)
            return ans;
        ans += root.data;
        count.count++;
        if(count.count >= k)
            return ans;
        
        return ans + helper(root.right,k,count);
    }
	public static int ksmallestElementSum(BinaryTreeNode<Integer> root, int k) {
		
        Count  count = new Count();
        return helper(root,k,count);

	}

}