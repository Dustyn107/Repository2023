"""
    Construir un programa que, al recibir como datos N numeros naturales
    determine cuantos de ellos son positivos, negativos o nulos.

    Si el usuario escribe un numero incorrecto, el programa no se ejecuta.
    En cambio, pregunta de nuevo por la informacion hasta que el dato ingresado sea corrrecto.
"""
comparar = True

while comparar==True:

    valor = int(input(f'Ingrese los valores a validar: '))
    positivo = 0
    negativo = 0
    nulo = 0


    if valor > 0:
        for i in range(valor):
            numero_Natural = int(input(f'ingrese un valor natural:'))
            if numero_Natural > 0:
                positivo += 1
            elif numero_Natural < 0:
                negativo += 1
            else:
                nulo += 1
        comparar =False

        print(f'la cantidad de numeros positvos es {positivo}')
        print(f'la cantidad de numeros negativo es {negativo}')
        print(f'la cantidad de numeros nulo es {nulo}')

    else:
     print(f'el valor no es correcto, vuelva a ingresar un dato entero')
