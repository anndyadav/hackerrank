
#include <iostream>

using namespace std;


int main() {
   int size, rot,i,no;
    cin>>size>>rot;
    int arr[size];
    
    for(i=0;i<size;i++){
        cin>>no;
        arr[(i+size-rot)%size] = no;
    }
    
    for(i=0;i<size;i++){
       cout<<arr[i]<<" ";
    }
    
    return 0;
}
