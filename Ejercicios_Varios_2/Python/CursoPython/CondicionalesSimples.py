'''
primer condicional simple
crear un programa que reciba el numero de años
e imprimir por consola si es nuevo o viejo
criterios de aceptacion: si es menor o igual a dos años es nuevo, pero si es mayor a dos años es
viejo
'''
year = int(input("Cuantos años tiene la computadora: "))

if year>= 0 and year <=2:
    print("Su computadora no es vieja")
else:
    print("Su computadora es vieja")
