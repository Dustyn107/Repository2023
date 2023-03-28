'''def saludar():
    print("hola")
saludar()
'''

def password():
    password = input("Ingrese su contraseña: ")
    if (len(password) >= 8):
        print("ok , password suficientemente largo")
        if (password == "Pruebas12345"):
            print("Ademas, la contraseña es correcta")
        else:
            print("pero la contraseña es incorrecta")
    else:
        print("Tu contraseña es muy corta e insegura")

password()
