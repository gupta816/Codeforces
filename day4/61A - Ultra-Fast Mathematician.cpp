#include<bits/stdc++.h>
using namespace std;
int main(){
    string n,m;
    cin>>n>>m;
    string str="";
    
    for(int i=0;i<n.length();i++)
    {
        if(n[i]==m[i])
        {
            str+="0";
        }
        else{
            str+="1";
        }
    }
    cout<<str<<endl;

    
    return 0;
}
