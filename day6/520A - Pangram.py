n=int(input())
s=input()
s=s.lower()
lst=list(s)
sl=set(lst)
mm=len(sl)
   
if mm==26:
    print("YES")
else:
    print("NO")
