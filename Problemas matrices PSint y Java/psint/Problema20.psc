Funcion v <- valor(c)
    Definir v Como Entero
    Segun c Hacer
        "0": v <- 0
        "1": v <- 1
        "2": v <- 2
        "3": v <- 3
        "4": v <- 4
        "5": v <- 5
        "6": v <- 6
        "7": v <- 7
        "8": v <- 8
        "9": v <- 9
        "A": v <- 10
        "B": v <- 11
        "C": v <- 12
        "D": v <- 13
        "E": v <- 14
        "F": v <- 15
    FinSegun
FinFuncion

Funcion c <- digito(v)
    Definir c Como Cadena
    Segun v Hacer
        0: c <- "0"
        1: c <- "1"
        2: c <- "2"
        3: c <- "3"
        4: c <- "4"
        5: c <- "5"
        6: c <- "6"
        7: c <- "7"
        8: c <- "8"
        9: c <- "9"
        10: c <- "A"
        11: c <- "B"
        12: c <- "C"
        13: c <- "D"
        14: c <- "E"
        15: c <- "F"
    FinSegun
FinFuncion

Proceso Problema20
    Definir base, i, va, vb, suma, acarreo, max Como Entero
    Definir a, b, resultado, da, db Como Cadena

    Escribir Sin Saltar "Base: "
    Leer base
    Escribir Sin Saltar "Sumando A: "
    Leer a
    Escribir Sin Saltar "Sumando B: "
    Leer b

    a <- Mayusculas(a)
    b <- Mayusculas(b)
    resultado <- ""
    acarreo <- 0

    Si Longitud(a) > Longitud(b) Entonces
        max <- Longitud(a)
    SiNo
        max <- Longitud(b)
    FinSi

    Mientras Longitud(a) < max Hacer
        a <- Concatenar("0", a)
    FinMientras

    Mientras Longitud(b) < max Hacer
        b <- Concatenar("0", b)
    FinMientras

    Para i <- max Hasta 1 Con Paso -1 Hacer
        da <- Subcadena(a,i,i)
        db <- Subcadena(b,i,i)
        va <- valor(da)
        vb <- valor(db)

        suma <- va + vb + acarreo
        resultado <- Concatenar(digito(suma MOD base), resultado)
        acarreo <- Trunc(suma / base)
    FinPara

    Mientras acarreo > 0 Hacer
        resultado <- Concatenar(digito(acarreo MOD base), resultado)
        acarreo <- Trunc(acarreo / base)
    FinMientras

    Escribir a
    Escribir b
    Escribir resultado
FinProceso
