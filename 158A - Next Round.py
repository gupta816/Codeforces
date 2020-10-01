count=0
n,k=map(int,input().split())
arr=list(map(int,input().strip().split()))
temp=arr[k-1]
for i in arr:
    if(i>=temp) and i>0:
        count+=1
print(count)
 
