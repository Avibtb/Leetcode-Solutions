
// Time Complexity - O(logN)
// Find nth fibonacci number


#include<bits/stdc++.h>
using namespace std;
map<long,long> F;
const long  M = 1e7;

long f(long n){
      if(F.count(n)) return F[n];
      long k = n/2;
      if(n%2 == 0){
            return F[n] = (f(k)*f(k) + f(k-1) * f(k-1)) % M;
      }
      else{
            return F[n] = (f(k) * f(k+1) + f(k-1) * f(k)) % M;
      }
}
int main(){
      long n;
      F[0] = F[1] = 1;
      while(cin>>n){
            cout<<(n==0 ? 0 :f(n-1))<<endl;
      }

}



