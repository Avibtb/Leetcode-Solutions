#include<bits/stdc++.h>
using namespace std;
#define ll long long int
#define us unsigned long long
#define endl "\n"
#define r(i,from,to)      for(auto i=(from); i<=(to); ++i)
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

/* 
* 
* 
*/

const int MAXN = 128 + 10;
 
int n, a[MAXN], lst[MAXN];
int main()
{
   FAST
   memset(lst, -1, sizeof(lst));
   a[0] = 0;
   for(int i=0;i+1 < MAXN;i++){
   	if(lst[a[i]] == -1)
   		a[i+1]  = 0;
   	else
   		a[i+1] = i - lst[a[i]];
   	lst[a[i]] = i;
   }
   int test ;
   cin >> test;
   while(test--){
   	int n;cin>>n;
   	int ans = 0;
   	fo(i,n)
   		ans  += a[i] == a[n-1];
   	cout << ans << endl;
   	
   }
   return 0;
}