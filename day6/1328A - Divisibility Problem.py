for _ in range(int(input())):
    a,b=map(int,input().split())
    count=0
 
    if a/b>1 and a%b!=0:
        temp=a
        a=a+b-(a%b)
        count=a-temp
    if a<b:
        count=b-a
        a=b
    while(True):
        if a%b==0:
            break
        a+=1
        
        count+=1
    print(count)
