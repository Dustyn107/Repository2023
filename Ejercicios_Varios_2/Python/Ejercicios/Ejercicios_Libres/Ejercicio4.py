'''
4. Escribir un programa que pida al usuario un
número entero y muestre por pantalla y diga si es par o impar.

'''

numero1 =int(input(f'ingrese un numero: '))

if numero1 % 2 ==0:
    print(f'El valor ingresado {numero1} es un numero par')
else:
    print(f'el numero {numero1} que se ingreso es un numero impar')