'''
En una escula de conduccion Se tiene un programa que dependiendo de la edad del usuario
debe mostrar el tipo de licencia que tiene derecho
Criterios de aceptacion:
!. si es menor a 16 no puede recibir licencia de conduccion
2. si es es menor a 18 entonces puede obtener un permiso especial
3. si es menor a 70 entonces puede acceder a una licencia estandar
4. si es mayor a 70 entonces  entonces necesita un licencia especial
'''
'''
edad = int(input("Digite su edad:  "))
if edad < 16:
    print("usted menor a 16 no puede recibir licencia de conduccion")
elif edad < 18:
    print("usted puede acceder a un permiso especial")
elif edad < 70:
    print("usted puede acceder ua una licencia estandar")
else:
    print("usted puede acceder a un permiso especial de conducion")
'''
n = "0"
m = "0"
if n > 0 and m > 0:
    # if m > 0:
    print("verdadero")
else:
    print("falso")
