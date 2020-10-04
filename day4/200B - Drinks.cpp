#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
     double x;
     double ans=0;
    for(int i=0;i<n;i++)
    {
        cin>>x;
        ans+=x;
    }
    cout<<(ans)/n<<endl;

    
    return 0;
}
