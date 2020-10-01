n=int(input())

maxi=0
curr=0
for _ in range(n):
    ex,en=map(int,input().strip().split())
    curr=curr+en
    curr=curr-ex
    if curr>maxi:
        maxi=curr
print(maxi)
