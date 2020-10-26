import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.io.*;
import java.util.*;


public class Main {
    static boolean[] prime=new boolean[10000001];



    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FastScanner fs = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        long  n = fs.nextLong();
        long count = 0;
        for(int i =0;i<n;i++) {
            String s = fs.next();

            if (s.equals("Tetrahedron")) {
                count += 4;
            }
            if (s.equals("Cube"))
                count += 6;
            if (s.equals("Octahedron"))
                count += 8;
            if (s.equals("Dodecahedron"))
                count +=12;
            if(s.equals("Icosahedron"))
                count +=20;
        }
        System.out.println(count);

    }

    static long slowPow(long base, int e) {
        long ans=1;
        for (int i=0; i<e; i++) ans*=base;
        return ans;
    }

    static long gcd(long a, long b) {
        if (b==0) return a;
        return gcd(b, a%b);
    }
    static void sieve(){
        for(int i=0;i<10000001;i++)
            prime[i]=true;

        int len=(int)Math.sqrt(prime.length)+1;
        for(int i=2;i<len;i++){
            if(prime[i]){
                for(int j=2*i;j<prime.length;j+=i){
                    prime[j]=false;
                }
            }
        }
        prime[0]=false;
        prime[1]=false;
    }

    static void sort(int[] a) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i:a) list.add(i);
        Collections.sort(list);
        for (int i=0; i<a.length; i++) a[i]=list.get(i);
    }
    static void sortReverse(long[] a) {
        ArrayList<Long> l=new ArrayList<>();
        for (long i:a) l.add(i);
        Collections.sort(l,Collections.reverseOrder());
        for (int i=0; i<a.length; i++) a[i]=l.get(i);
    }

    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }


        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long[] readArrayLong(long n) {
            long[] a=new long[(int)n];
            for (int i=0; i<n; i++) a[i]=nextLong();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }



}
