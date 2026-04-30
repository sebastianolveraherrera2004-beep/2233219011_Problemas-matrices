Proceso Problema10
    // En PSeInt no se manejan matrices irregulares reales como en Java.
    // Se simula guardando en la columna 0 cuantos datos tiene cada renglon.

    Definir M, r, c Como Entero
    Dimension M[3,5]

    M[0,0] <- 3
    M[0,1] <- 1
    M[0,2] <- 2
    M[0,3] <- 3

    M[1,0] <- 2
    M[1,1] <- 4
    M[1,2] <- 5

    M[2,0] <- 4
    M[2,1] <- 6
    M[2,2] <- 7
    M[2,3] <- 8
    M[2,4] <- 9

    Para r <- 0 Hasta 2 Hacer
        Para c <- 1 Hasta M[r,0] Hacer
            Escribir Sin Saltar M[r,c], " "
        FinPara
        Escribir ""
    FinPara
FinProceso
