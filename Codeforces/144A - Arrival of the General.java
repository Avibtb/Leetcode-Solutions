import java.util.*;
import java.io.*;
import java.lang.*;
public class Code {
    public static void  main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        int mini=0,maxi=0;
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
            if(a[maxi]<a[i]){
              maxi = i;
            }
            if(a[mini] >= a[i]){
                mini = i;
            }
        }

        System.out.println((mini<maxi)?((maxi-mini)+n-1-1):((maxi-mini)+n-1));

    }
}
