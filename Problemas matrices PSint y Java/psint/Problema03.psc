Proceso Problema03
    Definir m, r, c, izqArriba, derArriba Como Entero
    Dimension m[7,13]

    Para r <- 0 Hasta 6 Hacer
        Para c <- 0 Hasta 12 Hacer
            m[r,c] <- 0
        FinPara
    FinPara

    m[0,6] <- 1

    Para r <- 1 Hasta 6 Hacer
        Para c <- 0 Hasta 12 Hacer
            Si c > 0 Entonces
                izqArriba <- m[r-1,c-1]
            SiNo
                izqArriba <- 0
            FinSi

            Si c < 12 Entonces
                derArriba <- m[r-1,c+1]
            SiNo
                derArriba <- 0
            FinSi

            m[r,c] <- izqArriba + derArriba
        FinPara
    FinPara

    Escribir "Triangulo de Pascal:"
    Para r <- 0 Hasta 6 Hacer
        Para c <- 0 Hasta 12 Hacer
            Si m[r,c] = 0 Entonces
                Escribir Sin Saltar "    "
            SiNo
                Escribir Sin Saltar m[r,c], " "
            FinSi
        FinPara
        Escribir ""
    FinPara
FinProceso
