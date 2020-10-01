#include<bits/stdc++.h>
using namespace std;
int main()
{
    int mat[5][5];
    int x,y;
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<5;j++)
        {
            cin>>mat[i][j];
            if(mat[i][j]==1) {
                x=i;
                y=j;
            }
        }
    }
    int count =0;
    while(1)
    {
        if(x<2)
        {
            x++;
            count++;
        }
        if(y<2)
        {
            y++;
            count++;
        }
        if(x>2)
        {
            x--;
            count++;
        }
        if(y>2)
        {
            y--;
            count++;
        }
        if(x==2 && y==2) break;
    }
    cout<<count;
    
}
