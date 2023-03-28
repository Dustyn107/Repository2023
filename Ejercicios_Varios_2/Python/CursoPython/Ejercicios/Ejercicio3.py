'''
    Escribir un programa  que al escribir como dato un numero
    entero positivo N, Calcule el resultado de las siguientes series:
    1 + (1/2) + (1/3) +(1/4) ... (1/N)
    Si el usuario escribe un numero incorrecto, el programa no se ejecuta
    En cambio, pregunta de nuevo spor la informacion hasta que el dato sea correcto
'''
while (True):

        numero = int(input(f'ingrese un numero entero positivo: '))
        resultado = float(0)

        if numero > 0:
            print(f'el numero ingresado es correcto')
            for i in range(numero):

                resultado += (1 / float(i))
                print(f'el resultado es: {resultado}')
                print(type(resultado))
                "break"
        else:
            print(f'el numero ({numero}) no es entero positivo, vuelva a intentarlo')
