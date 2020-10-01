k,n,w=map(int,input().strip().split())
c=0
for i in range(1,w+1):
    c=c+k*i
if(c>n):
    print(c-n)
else:
    print(0)
