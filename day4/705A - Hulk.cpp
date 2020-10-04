#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    string str1="I hate ";
    string str2="I love ";
    string str3="it";
    string str4="that ";
    string temp;
    if(n==1)
    {
        cout<<str1<<str3;
    }
    else if(n==2)
    {
        cout<<str1<<str4<<str2<<str3;
    }
    else if(n%2==0)
    {
         cout<<str1<<str4;
        for(int i=0;i<n-2;i++)
        {
            if(i%2!=0) cout<<str1<<str4;
            else cout<<str2<<str4;
          
        }
        cout<<str2<<str3;
    
    }
    else{
         cout<<str1<<str4;
        for(int i=0;i<n-2;i++)
        {
            if(i%2!=0) cout<<str1<<str4;
            else cout<<str2<<str4;
          
        }
        cout<<str1<<str3;
    }
    cout<<endl;
    
    return 0;
}
