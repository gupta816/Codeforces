n=int(input())
n+=1
while(True):
    if len(set([n//1000,n%1000//100,n%100//10,n%10]))<4:
        n+=1
    else:
        break
print(n)
    
