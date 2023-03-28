'''

    Escribe un programa que permita generar la tabla de un numero entero
    positivo N, comenzando desde 1.

    Si el usuario escribe un numero incorrecto el programa no se ejecuta , en cambio preguntara de nuevo por la informacion
    hasta que el dato ingresado sea correcto

'''

comparar = True

while  comparar==True:

    numero1 = int(input("Ingrese numero entero positivo: \n"))

    if numero1 > 0:
        print("el numero ingresado es correcto!! \n")

        for i in range(1, 11):
            print(f'{numero1} X {i} = {numero1 * i}')

            comparar = False
    else:
        print(f'el numero ingresado no es correcto, intente de nuevo')