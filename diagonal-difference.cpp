#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main(){
    int n, sum1=0, sum2=0, sum3=0;
    cin >> n;
    int arr[n][n];
    for(int i=0;i<n; i++){
     for(int j=0;j<n; j++) {
         cin>>arr[i][j];
     }
     
    }
    for(int i=0; i<n; i++){
       sum1= arr[i][i]+sum1;
       }

    int q,r=n-1;
    
    for(q=0; q<n; q++){
        sum2=arr[q][r]+sum2;
        r--;
    }

    if(sum1>sum2){
        sum3=sum1-sum2;
    }
    else{
        sum3=sum2-sum1;
    }
    
 cout<<sum3;
    return 0;
}
