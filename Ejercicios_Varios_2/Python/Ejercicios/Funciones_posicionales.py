def suma(*args):
     s = 0
     for arg in args:
         s += arg
     return s

resultado = suma (3,4,5,6, 7, 8, 9)

print(resultado)