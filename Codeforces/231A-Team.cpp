#include<iostream>

using namespace std;

int main(){
	int a,b,c,k=0,sum,n;
	cin>> n ;
	for (int i = 1; i<=n ; i++){
		cin >>a >>b >>c;
	sum=a+b+c;
	if(sum>=2){
		k++;
	}
	}
	cout<< k;
	return 0;
}

 