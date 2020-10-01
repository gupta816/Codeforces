for _ in range(int(input())):
    s=input()
    if(len(s)<=10):
        print(s)
    else:
        xx=len(s)-2
        yy=str(xx)
        print(s[0]+yy+s[-1])
