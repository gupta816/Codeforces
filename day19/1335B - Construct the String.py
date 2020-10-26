for _ in range(int(input())):
    n,a,b=map(int,input().split())
    arr=[]
    for i in range(n):
        arr.append(chr(ord('a') + i % b))
    st=""
    print(st.join(arr))
    
    
    
