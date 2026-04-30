SubProceso generar(a Por Referencia)
    Definir r, c Como Entero
    Para r <- 0 Hasta 3 Hacer
        Para c <- 0 Hasta 6 Hacer
            a[r,c] <- Aleatorio(10,99)
        FinPara
    FinPara
FinSubProceso

SubProceso imprimir_arreglo(a)
    Definir r, c Como Entero
    Para r <- 0 Hasta 3 Hacer
        Para c <- 0 Hasta 6 Hacer
            Escribir Sin Saltar a[r,c], " "
        FinPara
        Escribir ""
    FinPara
FinSubProceso

SubProceso imprimir_recorrido(a, r, c, n)
    Definir i Como Entero
    Escribir "Los numeros por los que se paso son:"
    Para i <- 1 Hasta n Hacer
        Escribir Sin Saltar a[r,c], " "
        r <- (r + 1) MOD 4
        c <- (c + 1) MOD 7
    FinPara
    Escribir ""
FinSubProceso

Proceso Problema05
    Definir a, r, c, n Como Entero
    Dimension a[4,7]

    generar(a)
    Escribir "Los numeros generados en el arreglo son:"
    imprimir_arreglo(a)

    Escribir Sin Saltar "Renglon inicial (0 a 3): "
    Leer r
    Escribir Sin Saltar "Columna inicial (0 a 6): "
    Leer c
    Escribir Sin Saltar "Cuantas veces hacer el recorrido: "
    Leer n

    imprimir_recorrido(a,r,c,n)
FinProceso
