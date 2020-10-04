#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int h=0;
    int x;
    for(int i=0;i<n;i++)
    {
        cin>>x;
        if(x==1) h++;
    }
    if(h==0)
    {
        cout<<"EASY";
    }
    else{
        cout<<"HARD";
    }

    return 0;
}
