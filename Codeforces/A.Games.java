/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int []a = new int[n];
		int []h = new int[n];
		int ans = 0;
		for(int i =0;i<n; i++){
		    a[i] = s.nextInt();
		    h[i] = s.nextInt();
		    for(int j=0;j<n;j++){
		    if (h[i] == a[j])
            {
                ans += 1;
            }
            if (a[i] == h[j])
            {
                ans += 1;
            }
		    }
		}
		System.out.println(ans);
	
	}
}
