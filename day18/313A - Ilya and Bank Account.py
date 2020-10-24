n=input()
if int(n)>0:
    print(n)
else:
    n= n.replace("-","")
    x=len(n)
    if int(n[x-1])>=int(n[x-2]):
        print("-"+n[0:x-1])
    elif (x==2 and (int(n[x-1])==0 or int(n[x-2])==0)):
        print(0)
    else:
        print("-"+n[0:x-2]+n[x-1])
    
    
