"""
Escribir un programa que pida al usuario dos números y muestre por
pantalla su división. Si el divisor es cero el programa debe mostrar un error.
"""
valor1 = float(input(f'Ingrese el un valor: '))
Divisor = float(input(f'Ingrese el divisor: '))

if Divisor == 0:
    print(f'ERROR---> el Divisor no puede ser cero')
else:
    resultado = (valor1 / Divisor)
    print(f'el resultado de la division es {resultado}')
