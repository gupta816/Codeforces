t=int(input())

arr=[100,20,10,5,1]

bill=0
i=0
while(True):
    if t==0:
        break
    if arr[i]<=t:
        t-=arr[i]
        bill+=1
    else:
        i+=1
    
print(bill)
