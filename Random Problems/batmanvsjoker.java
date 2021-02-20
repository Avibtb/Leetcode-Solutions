/**
 * Gotham has been attacked by Joker . Bruce Wayne has deployed automatic machine gun at each tower of Gotham.
All the towers in Gotham are in straight line.
You are given no of towers 'n' followed by height of 'n' towers.
For every tower(p), find the height of the closest tower (towards the right), greater than the height of tower(p).
Now , Print sum of all such heights (mod 1000000007).
Note : If for a tower(k) , no such tower exsits then take its height as 0.
Input Format:
First line contains 'n' denoting no of towers.
This is followed by 'n' spaced integers h1,h2.....h(n) representing height of towers. 
Output Format:
On a single line, output the sum(mod 1000000007).
Constraints:
1<=n<=100000
0<=h[i]<=100000 
Sample Input:
9
112 133 161 311 122 512 1212 0 19212
Sample Output:
41265
 */

import java.util.*;

public class batmanvsjoker {

    public static void main(String args[]) {
        //Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = s.nextInt();
        Stack<Integer> str = new Stack<Integer>();
        int mod = 1000000007;
        int  rem = 0;
        for(int i=0;i<n;i++){
            while(!str.isEmpty() && arr[i] > str.peek()){
                rem = (rem  + arr[i] ) % mod;
                str.pop();
            }
            str.push(arr[i]);
        }
        System.out.print(rem);
    }

}