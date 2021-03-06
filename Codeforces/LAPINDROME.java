/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s = new Scanner(System.in);
	    int t =  s.nextInt();
	    s.nextLine();
	    while(t-->0){
	        String str = s.nextLine();
	        int len  = str.length();
	        String s1 = str.substring(0,len/2);
	        String s2  = str.substring(len%2==0?len/2:(len/2)+1,len);
	        char ar[] = s1.toCharArray();
	        Arrays.sort(ar);
	        s1 = String.valueOf(ar);
	        char a[] = s2.toCharArray();
	        Arrays.sort(a);
	        s2 = String.valueOf(a);
	        	if(s1.compareTo(s2)==0){
    		    System.out.println("YES");
    		}
    		else{
    		    System.out.println("NO");
    		}   
	     
	    }
	
	}
}
