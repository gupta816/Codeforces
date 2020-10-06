n=input()
arr=[]
for i in n:
    if i not in "{}, ":
        arr.append(i)
sarr=set(arr)

print(len(sarr))
    
