dict={"Tetrahedron" : 4,"Cube" : 6 ,"Octahedron" : 8,"Dodecahedron" : 12 ,"Icosahedron":20 }
f=0
for _ in range(int(input())):
    s=input()
    f+=dict[s]
print(f)
    
