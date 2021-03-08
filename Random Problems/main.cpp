#include<bits/stdc++.h>
using namespace std;
#define fastIO ios_base::sync_with_stdio(false);cin.tie(0);cout.tie(0);
#define ll long long
#include<vector>
#include<map>
#include<queue>
#define pb push_back
#define ff first
#define se second
#define pll                 pair<ll, ll>
#define vi                  vector<ll>
#define vpl                 vector<pll>
#include<stack>
#include<set>
#define mod 1000000007
#define inf INT_MAX
#define mem(a,val) memset(a,val,sizeof(a))
#define prec(n) fixed<<setprecision(n)
#define bitcount(n) __builtin_popcountll(n)
 

typedef pair<ll,ll> pl;
void solve(){
	ll i,j,k,l,n,m,a,b,u;
	string s;
	cin>>s;
	n=s.size();
	ll cnt[26]={0};
	for(auto c: s) cnt[c-'a']++;
	ll o=0,e=0,one=0;
	for(i=0;i<26;i++){
		if(cnt[i]>0){
			if(cnt[i]==1)
			one++;
			else if(cnt[i]%2==0)
			e++;
			else
			o++;
		}
	}
	if(one<=o)
	cout<<"YES\n";
	else 
	cout<<"NO\n";
    
}
int main(){
    fastIO
    ll t;
    cin>>t;
    while(t--)
    solve();
	return 0;
}