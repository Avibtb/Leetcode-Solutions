#include<bits/stdc++.h>
#include<cstring>
#include<string.h>
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
#define vec1 vector<string>
#define vec2 vector<vector<int>>
#define all(n) (n).begin(), (n).end()
#define s(a,n) sort(a,a+n);
#define sv(a) sort(a.begin(),a.end());
//Author:-Avinash//
    
#define MAX 1000
int main()
{

    FAST
    T{
      ll n;
      cin>>n;
      vec a(n);
      for(auto &it : a)
        cin>>it;
      sort(all(a));
      bool res = true;
      for(int i = 1; i<n;++i){

       res &=  a[i] - a[i-1] <=1;
      }
      if(res)
        cout<<"YES"<<endl;
      else
        cout<<"NO"<<endl;
    

      }
      
   return 0;
 }
    





    
    



  

   
   


    
    
    

  

