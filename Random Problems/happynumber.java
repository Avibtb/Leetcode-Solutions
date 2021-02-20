/**
 * Given a number n, find if it is a happy number or not. A number is called happy if a sequence of steps leads to 1 where in each sequence of step the number is replaced by sum of square of its digit, i.e., if we start with Happy Number and keep replacing it with digits square sum, we reach 1.
Input Format
Line 1 : An integer n.
Output Format
true, if number is a happy number, otherwise false. 
Input Constraints
1 <= n <= 10^4
Sample Input 1:
13
Sample Output 1:
true
Sample Output 1 explanation
1^2 + 3^2 = 10
1^2 + 0^2 = 1
Since we reached 1, 13 is happy number
Sample Input 2:
14
Sample Output 2:
false
 */

 
public class happynumber {
    
    public static int help(int n)
    {
        int c =0;
        while(n != 0)
        {
            c += (n%10) * (n%10);
            n = n/10;
        }
        return c;
    }
	public static boolean findHappyNumber(int n) {
	
        int a , b;
        a = b = n;
        do{
            a = help(a);
            b = help(help(b));
            
        }while( a != b);
        
        return(b == 1);
        

	}
}