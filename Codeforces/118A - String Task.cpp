

//AUTHOR:- Avinash//
#include<bits/stdc++.h>
#include<iostream>
using namespace std;
#define ll long long int
#define lll long long
#define fo(i,n) for(int i=0;i<n;i++)
#define take(a,i,n) for(int i=0;i<n;i++) cin>>a[i]
#define FAST ios_base::sync_with_stdio(false);cin.tie(NULL);
#define ld long long double
#define d1(x) cout<<(x)<<endl
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
   string s,str;
   cin>>s;
   int len = s.length();
   for(int i = 0;i<len;i++)
   {
     if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' || s[i] == 'y' || s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U' || s[i] == 'Y')
        continue;
     else{
        str += '.';
        str += towlower(s[i]);
     }
   }
   cout<<str;
   return 0;
}








