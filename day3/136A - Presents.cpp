#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int arr[n+1];
    int x=0;
    for(int i=1;i<n+1;i++)
    {
        cin>>x;
        arr[x]=i;
    }
    for(int i=1;i<n+1;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    
    
    return 0;
}
