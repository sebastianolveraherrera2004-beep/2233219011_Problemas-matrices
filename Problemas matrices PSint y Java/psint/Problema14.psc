Proceso Problema14
    Definir fa, ca, fb, cb, r, c, k Como Entero
    Definir A, B, C Como Entero

    Escribir Sin Saltar "Filas de A: "
    Leer fa
    Escribir Sin Saltar "Columnas de A: "
    Leer ca
    Escribir Sin Saltar "Filas de B: "
    Leer fb
    Escribir Sin Saltar "Columnas de B: "
    Leer cb

    Dimension A[fa,ca]
    Dimension B[fb,cb]

    Para r <- 0 Hasta fa-1 Hacer
        Para c <- 0 Hasta ca-1 Hacer
            A[r,c] <- Aleatorio(-9,20)
        FinPara
    FinPara

    Para r <- 0 Hasta fb-1 Hacer
        Para c <- 0 Hasta cb-1 Hacer
            B[r,c] <- Aleatorio(-9,20)
        FinPara
    FinPara

    Escribir "Matriz A"
    Para r <- 0 Hasta fa-1 Hacer
        Para c <- 0 Hasta ca-1 Hacer
            Escribir Sin Saltar A[r,c], " "
        FinPara
        Escribir ""
    FinPara

    Escribir "Matriz B"
    Para r <- 0 Hasta fb-1 Hacer
        Para c <- 0 Hasta cb-1 Hacer
            Escribir Sin Saltar B[r,c], " "
        FinPara
        Escribir ""
    FinPara

    Si ca <> fb Entonces
        Escribir "No es posible multiplicar: columnas de A deben ser iguales a filas de B."
    SiNo
        Dimension C[fa,cb]

        Para r <- 0 Hasta fa-1 Hacer
            Para c <- 0 Hasta cb-1 Hacer
                C[r,c] <- 0
                Para k <- 0 Hasta ca-1 Hacer
                    C[r,c] <- C[r,c] + A[r,k] * B[k,c]
                FinPara
            FinPara
        FinPara

        Escribir "Matriz C"
        Para r <- 0 Hasta fa-1 Hacer
            Para c <- 0 Hasta cb-1 Hacer
                Escribir Sin Saltar C[r,c], " "
            FinPara
            Escribir ""
        FinPara
    FinSi
FinProceso
