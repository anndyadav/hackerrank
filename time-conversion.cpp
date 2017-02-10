#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <cstring>
using namespace std;

int main(){
   char time[100];
    int v;
    cin>>time;
    int x= strlen(time);
    int flag=time[x-2];
    time[x-2]='\0';
    if(flag == 'A') {
        if(time[0] == '1' && time[1]=='2')
            cout<<"00"<<&time[2];
        else
            cout<<time;
    }else{
        if(time[0] =='1' && time[1]=='2')
            cout<<"12"<<&time[2];
        else{
            v = time[0]-'0';
            v = v*10+time[1]-'0'+12;
            cout<<v<< &time[2];
        }
    }
    return 0;
}
                                                                                                                                                                                                           
