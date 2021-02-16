/**
 * Example 1: Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 *  
 *  Example 2: Input: prices = [7,6,4,3,1]
 *  Output: 0
*   Explanation: In this case, no transactions are done and the max profit = 0.
*/


#include<bits/stdc++.h>
using namespace std;

int main(){
      int n;
      cin>>n;
      int prices[n+1];
      for(int i= 0;i<n;i++)
      {
            cin>>prices[i];
      }
      
      int profit = 0, pmin = prices[0];
      
      for(int i=1;i<n;i++)
      {
            int new_profit = prices[i] - pmin;
            profit = max(profit,new_profit);
            pmin = min(pmin,prices[i]);
      }
      
      cout<<profit<<endl;
}