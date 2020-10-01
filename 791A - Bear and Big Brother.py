l,b=map(int,input().strip().split())

yrs=0

while(True):
    if(l>b):
        break
    l=l*3
    b=b*2
    yrs+=1
print(yrs)
