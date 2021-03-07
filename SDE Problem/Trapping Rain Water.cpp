
#include<bits/stdc++.h>
using namespace std;
#define ll long long int
#define us unsigned long long
#define rep(i, a, b) for(ll i = a; i < b; i++)
#define fo(i,n) for(int i=0;i<n;i++)
#define take(a,i,n) for(ll i=0;i<n;i++) cin>>a[i]
#define FAST ios_base::sync_with_stdio(false);cin.tie(NULL);
#define ld long long double
#define T int t;cin>>t;while(t--)
#define hell 1000000007
#define ex endl;
#define mp make_pair
#define F first
#define all(v) v.begin(),v.end()
#define maxn 1000001
#define pi 3.14159265
#define S second
#define P pair<int,int>
#define PP pair<int,pair<int,int>>
#define pb push_back
#define in insert
#define s(a,n) sort(a,a+n);
#define sv(a) sort(a.begin(),a.end());   
#define r(i,from,to)      for(auto i=(from); i<=(to); ++i)
#define MAX 1000


int power(int x, int y, int mdd = hell)
{
    int temp;
    if (y == 0)
        return 1;
    temp = power(x, y / 2);
    if (y % 2 == 0)
        return (temp * temp) % mdd;
    else
        return (x * (temp * temp) % mdd) % mdd;
}

int gcd(int a, int b)
{
    if(a==0)
        return b;
    return(gcd(b%a,a));
}

/**
  C++ program to find maximum of water that can 
  be trapped within given set of bars.
  TC : O(n)
  SC : O(1)
*/

int main()
{
    FAST
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    	cin>>a[i];
    int water = 0, lmax  = 0 ,rmax = 0;
    int low = 0, high = n-1;
    while(low<=high)
    {
    	if(a[low] < a[high])
    	{
    		if(a[low] > lmax)
    			lmax = a[low];
    		else
    			water += lmax - a[low];
    		low++;
    	}
    	else
    	{
    		if(a[high] > rmax)
    			rmax = a[high];
    		else
    			water += rmax - a[high];
    		high--;
    	}
    }
    cout<<water<<"\n";  
   return 0;
}