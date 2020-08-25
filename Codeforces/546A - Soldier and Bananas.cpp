//AUTHOR:- Avinash//
#include<bits/stdc++.h>
using namespace std;
#define ll long long int
#define lll long long
#define fo(i,n) for(int i=0;i<n;i++)
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
//Author:-Avinash//

ll power(ll x, ll y, ll m) 
{ 
    if (y == 0) 
        return 1; 
    ll p = power(x, y/2, m) % m; 
    p = (p * p) % m; 
    return (y%2 == 0)? p : (x * p) % m; 
} 
 
ll modInverse(ll a, ll m) 
{  
    return power(a, m-2, m);  
}

int main()
{
  FAST
  ll k,n,w,cost(0);
  cin>>k>>n>>w;
  for(ll i=1;i<=w;i++){
    cost += i*k;
  }
  //cout<<cost<<endl;
  if(cost>n){
    cout<<cost-n;
  }    
  else{
    cout<<"0";
  }
  
  return 0;
}
 