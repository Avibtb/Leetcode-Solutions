#include<bits/stdc++.h>
using namespace std;
#define ll long long int
#define fo(i,n) for(int i=0;i<n;i++)
#define FAST ios_base::sync_with_stdio(false);cin.tie(NULL);
#define ld long long double
#define T int t;cin>>t;while(t--)
#define MOD 1000000007
#define ex endl;
#define F first
#define maxn 200001
#define S second
#define P pair<int,int>
#define PP pair<int,pair<int,int>>
#define pb push_back
#define in insert
#define vec vector<int>
#define vec2 vector<vector<int>>
#define s(a,n) sort(a,a+n);
#define sv(a) sort(a.begin(),a.end());
//Author:-Avinash//
    
#define MAX 1000
int main()
{

    FAST
    int n,b;
    cin>>n;
    for(int i =0;i<n;i++){
      string a;
      cin>>a;
      b = a.size();
      if( b>10)
        cout<<a[0]<<b-2<<a[b-1]<<endl;
      else
        cout<<a<<endl;
    

    }
    
    
}
  
 