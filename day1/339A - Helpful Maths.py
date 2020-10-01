a=input()
arr=[]
l=len(a)
for i in range(l):
    if a[i]!="+":
        arr.append(a[i])
arr.sort()
st=""
for i in range(len(arr)):
    st+=arr[i]
    st+="+"
    
print(st[0:l])
    
