#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    string a;
    int m1=0;
    int m2=0;
    int c=1;
    while(n--)
    {
        cin>>a;
        if(a=="10" && m2==0){
            m1++;
        }
        else if(a=="01" && m1==0)
        {
            m2++;
        }
        else if(a=="01" && m1!=0){
            m1=0;
            m2++;
            c++;
        }
        else if(a=="10" && m2!=0){
            m2=0;
            m1++;
            c++;
        }
    }
    cout<<c<<endl;
    return 0;
}
