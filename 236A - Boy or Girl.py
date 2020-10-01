a=input()
arr=[]
for i in range(len(a)):
    arr.append(a[i])
s=set(arr)
if len(s)%2==0:
    print("CHAT WITH HER!")
else:
    print("IGNORE HIM!")
