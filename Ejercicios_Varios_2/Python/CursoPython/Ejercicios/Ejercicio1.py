#print("Hola")
'''
2. Escribir un programa que almacene la cadena ¡Hola Mundo!
en una variable y luego muestre por pantalla el contenido de la variable.
R/
message = "hola"
print(message)

Ejercicio 3
Escribir un programa que pregunte el nombre del usuario en la consola y
después de que el usuario lo introduzca muestre por pantalla la cadena
¡Hola <nombre>!, donde <nombre> es el nombre que el usuario haya introducido.

R/
name=input("Ingrese su nombre: ")
print(f'mi nombre es {name}')

Escribir un programa que muestre por pantalla el resultado
de la siguiente operación aritmética  (3+2/2⋅5)2

R/
print(((3+2)/(2*5))**2)

Escribir un programa que pregunte al usuario su edad y
muestre por pantalla si es mayor de edad o no.

R/
age= int (input("Ingrese su edad: "))
if age >18:
    print(f'su edad es {age} usted es mayor de edad ');
else:
    print(f'su edad es {age} usted es menor de edad');


Escribir un programa que almacene la cadena de caracteres
contraseña en una variable, pregunte al usuario por la contraseña e
imprima por pantalla si la contraseña introducida por el usuario
coincide con la guardada en la variable sin tener en
cuenta mayúsculas y minúsculas.

R/

'''
key = "contraseña"
password = input("ingrese su contraseña: ")

if key == password.lower():
    print("la contraseña es correcta")
else:
    print("la contraseña es diferente")
