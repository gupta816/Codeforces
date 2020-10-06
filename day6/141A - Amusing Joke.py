s1=input()
s2=input()
s3=input()
l1=sorted(list(s1))
l2=sorted(list(s2))
l3=sorted(list(s3))
l4=l1+l2
l4=sorted(l4)


if l4==l3:
    print("YES")
else:
    print("NO")
