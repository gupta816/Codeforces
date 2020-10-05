#include <bits/stdc++.h>
using namespace std;
int main() {
    int k,l,m,n,d;
    cin>>k;
    cin>>l;
    cin>>m;
    cin>>n;
    cin>>d;
    int tk=k;
    int tl=l;
    int tm=m;
    int tn=n;
    int count=0;
    for(int i=1;i<d+1;i++)
    {
        if(i==k || i==l || i==m || i==n)
        {
            count++;
            if(i==k) k+=tk;
            if(i==l) l+=tl;
            if(i==m) m+=tm;
            if(i==n) n+=tn;
        }
    }
    cout<<count<<endl;
    
	return 0;
}
