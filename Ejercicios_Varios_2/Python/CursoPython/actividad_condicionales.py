nombre = input("ingrese el nombre de comprador: ")
valorCompra = float(input("Ingrese el valor de la compra; "))

if valorCompra < 80:
    print(f'Hola, {nombre}. El valor a pagar es: ${valorCompra}')
elif 80 <= valorCompra < 150:
    descuento = 0.1
elif 150 <= valorCompra <= 300:
    descuento = 0.15
elif 300 <= valorCompra < 500:
    descuento = 0.2

precio_final = valorCompra - (valorCompra * descuento)

print(f'Compra sin descuento: {valorCompra} \n Compra con descuento: {precio_final} ')
