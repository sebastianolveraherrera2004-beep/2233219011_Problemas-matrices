Proceso Problema01
    Definir a, r, c Como Entero
    Dimension a[6,5]

    Para c <- 0 Hasta 4 Hacer
        Para r <- 0 Hasta 5 Hacer
            a[r,c] <- Aleatorio(100,900)
        FinPara
    FinPara

    Escribir "Arreglo generado:"
    Para r <- 0 Hasta 5 Hacer
        Para c <- 0 Hasta 4 Hacer
            Escribir Sin Saltar a[r,c], " "
        FinPara
        Escribir ""
    FinPara
FinProceso
