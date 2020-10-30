/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0){
		    int g = s.nextInt();
		    while(g-->0){
		        int i = s.nextInt();
		        int n = s.nextInt();
		        int q = s.nextInt();
		        if(n%2 == 0)
		        System.out.println(n/2);
		        else{
		            if(i==q)
		            System.out.println((n-1)/2);
		            else
		            System.out.println((n+1)/2);
		        }
		    }
		    
		}
	}
}
