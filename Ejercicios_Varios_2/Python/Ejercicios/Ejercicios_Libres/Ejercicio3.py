'''
3) Declara 2 variables numéricas (con el valor que desees),
he indica cual es mayor de los dos. Si son iguales indicarlo también.
Ve cambiando los valores para comprobar que funciona.
'''

numero1= int(input("ingrese un primer valor: "))
numero2= int(input("ingrese un segundo valor: "))

if numero1!= numero2:
    if numero1 > numero2:
        print(f'el primer valor ingresado es mayor al segundo valor')
    else:
        print(f'El segundo valor es mayor que el primer valor ingresado')
else:
    print(f'los valores son iguales, vuelva a intentar')


