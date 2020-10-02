s1=input()
s2=input()
x=""
for i in range(len(s1)-1,-1,-1):
    x+=s1[i]
if s2==x:
    print("YES")
else:
    print("NO")
