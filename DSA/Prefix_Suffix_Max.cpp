#include<bits/stdc++.h>
using namespace std;

void prefix_sufix(int a[],int n){
	int Pmax[n];
	Pmax[0] = a[0];
	for(int i=1;i<n;i++){
		Pmax[i] = max(Pmax[i-1],a[i]);
	}
	cout<<"Prefix max in array:"<<endl;
	for(int i=0;i<n;i++){
		cout<<Pmax[i]<<" ";
	}
	cout<<endl;


	int Smax[n];
	Smax[n-1] = a[n-1];
	for(int i=n-2;i>=0;i--){
		Smax[i] = max(Smax[i+1],a[i]);
	} 
	cout<<"Suffix max in array:"<<endl;
	for(int i=0;i<n;i++){
		cout<<Smax[i]<<" ";
	}
	cout<<endl;

}

int main(){
	int n;
	cin>>n;
	int a[n];
	for(int i =0;i<n;i++){
		cin>>a[i];
	}
	prefix_sufix(a,n);
}