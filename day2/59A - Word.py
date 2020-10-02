n=input()
isu=0
ilu=0
for i in n:
    if i.isupper()==True:
        isu+=1
    else:
        ilu+=1
if isu<=ilu:
    print(n.lower())
else:
    print(n.upper())
        
