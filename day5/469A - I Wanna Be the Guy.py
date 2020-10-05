n=int(input())

parr=list(map(int,input().strip().split()))
qarr=list(map(int,input().strip().split()))
parr.remove(parr[0])
qarr.remove(qarr[0])
narr=parr+qarr

sarr=set(narr)
count=0
for i in sarr:
    count+=1
if(count==n):
    print("I become the guy.")
else:
    print("Oh, my keyboard!")
    
