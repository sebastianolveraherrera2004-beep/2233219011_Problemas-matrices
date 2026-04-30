Proceso Problema23
    Definir a, b Como Caracter
    Definir cadena Como Cadena
    Definir i, numero Como Entero

    Dimension a[6]
    a[0] <- "1"
    a[1] <- "5"
    a[2] <- "3"
    a[3] <- "8"
    a[4] <- "6"
    a[5] <- "2"

    Dimension b[3]
    b[0] <- "4"
    b[1] <- "0"
    b[2] <- "1"

    cadena <- ""
    Para i <- 0 Hasta 5 Hacer
        cadena <- Concatenar(cadena, a[i])
    FinPara
    numero <- ConvertirANumero(cadena)
    Escribir "La cadena es ", cadena
    Escribir "Convertido a numero y multiplicado por 2 es ", numero * 2

    cadena <- ""
    Para i <- 0 Hasta 2 Hacer
        cadena <- Concatenar(cadena, b[i])
    FinPara
    numero <- ConvertirANumero(cadena)
    Escribir "La cadena es ", cadena
    Escribir "Convertido a numero y multiplicado por 2 es ", numero * 2
FinProceso
