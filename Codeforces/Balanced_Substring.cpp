//AUTHOR:- Avinash//
#include<bits/stdc++.h>
using namespace std;
#define lll long long int
#define ll long long
#define fo(i,n) for(ll i=0;i<n;i++)
#define take(a,i,n) for(int i=0;i<n;i++) cin>>a[i]
#define FAST ios_base::sync_with_stdio(false);cin.tie(NULL);
#define ld long long double
#define T int t;cin>>t;while(t--)
#define hell 1000000007
#define ex endl;
#define F first
#define maxn 200001
#define pi 3.14159265
#define S second
#define P pair<int,int>
#define PP pair<int,pair<int,int>>
#define pb push_back
#define in insert
#define vec vector<ll>
#define vec2 vector<vector<int>>
#define s(a,n) sort(a,a+n);
#define sv(a) sort(a.begin(),a.end());   
#define MAX 1000
#define bawal(d) cout<<d<<endl;
//Author:-Avinash//

ll power(ll x, ll y, ll m) 
{ 
    if (y == 0) 
        return 1; 
    ll p = power(x, y/2, m) % m; 
    p = (p * p) % m; 
    return (y%2 == 0)? p : (x * p) % m; 
} 
int find(int a[], int n, int x, int p) {
int min = 100000000, minop;
for(int i=0;i<n;i++)
if(a[i] == x) {
if(abs(p-i) < min) {
min = abs(p-i);
minop = i;
}
}
return minop;
}
 
ll modInverse(ll a, ll m) 
{  
    return power(a, m-2, m);  
}

int gcd(int a, int b, int& x, int& y) {
    x = 1, y = 0;
    int x1 = 0, y1 = 1, a1 = a, b1 = b;
    while (b1) {
        int q = a1 / b1;
        tie(x, x1) = make_tuple(x1, x - q * x1);
        tie(y, y1) = make_tuple(y1, y - q * y1);
        tie(a1, b1) = make_tuple(b1, a1 - q * b1);
    }
    return a1;
}



int main()
{
    FAST
  T{
        int n;
        cin>>n;
        string s;
        cin>>s;
        int m=0;
        for(int i =0;i<n;i++){
              if(s[i] == 'a' && s[i+1] == 'b' || s[i] == 'b' && s[i+1] == 'a'){
                    cout<<i+1<<" "<<i+2<<endl;
                    m=1;
                    break;
              }
        }
        if(m==0){
              cout<<-1<<" "<<-1<<endl;
        }
        
        
  }




 return 0;
}