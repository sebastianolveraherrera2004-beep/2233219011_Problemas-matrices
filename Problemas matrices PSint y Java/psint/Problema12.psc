Proceso Problema12
    Definir n, r, c, m, sumaDiagonal, sumaMultiplos3Arriba Como Entero

    Escribir Sin Saltar "n: "
    Leer n
    Dimension m[n,n]

    sumaDiagonal <- 0
    sumaMultiplos3Arriba <- 0

    Escribir "Matriz"
    Para r <- 0 Hasta n-1 Hacer
        Para c <- 0 Hasta n-1 Hacer
            m[r,c] <- Aleatorio(0,12)
            Escribir Sin Saltar m[r,c], " "

            Si r = c Entonces
                sumaDiagonal <- sumaDiagonal + m[r,c]
            FinSi

            Si r < c Y m[r,c] MOD 3 = 0 Entonces
                sumaMultiplos3Arriba <- sumaMultiplos3Arriba + m[r,c]
            FinSi
        FinPara
        Escribir ""
    FinPara

    Escribir "Suma de la diagonal = ", sumaDiagonal
    Escribir "Suma de multiplos de 3 arriba de la diagonal = ", sumaMultiplos3Arriba
FinProceso
