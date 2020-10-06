n=int(input())
harr=[]
garr=[]
for _ in range(n):
    h,g=map(int,input().split())
    harr.append(h)
    garr.append(g)
count=0
for i in range(n):
    for j in range(n):
        if harr[i]==garr[j]:
            count+=1
print(count)
