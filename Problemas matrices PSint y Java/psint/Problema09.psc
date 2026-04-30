Proceso Problema09
    Definir n, r, c Como Entero
    Definir t Como Caracter

    Escribir Sin Saltar "De cuantos renglones quieres la figura de triangulo: "
    Leer n

    Dimension t[n,n]

    Para r <- 0 Hasta n-1 Hacer
        Para c <- 0 Hasta r Hacer
            t[r,c] <- "*"
        FinPara
    FinPara

    Para r <- 0 Hasta n-1 Hacer
        Para c <- 0 Hasta r Hacer
            Escribir Sin Saltar t[r,c], " "
        FinPara
        Escribir ""
    FinPara
FinProceso
