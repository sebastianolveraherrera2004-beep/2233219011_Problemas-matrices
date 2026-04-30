Proceso Problema18
    Definir n, i, mayor, menor Como Entero
    Definir v Como Entero

    Escribir Sin Saltar "n: "
    Leer n

    Dimension v[n]

    Escribir "Valores generados:"
    Para i <- 0 Hasta n-1 Hacer
        v[i] <- Aleatorio(0,50)
        Escribir Sin Saltar v[i], " "
    FinPara
    Escribir ""

    mayor <- v[0]
    menor <- v[0]

    Para i <- 1 Hasta n-1 Hacer
        Si v[i] > mayor Entonces
            mayor <- v[i]
        FinSi
        Si v[i] < menor Entonces
            menor <- v[i]
        FinSi
    FinPara

    Escribir Sin Saltar "Mayor = ", mayor, " en posicion: "
    Para i <- 0 Hasta n-1 Hacer
        Si v[i] = mayor Entonces
            Escribir Sin Saltar i+1, " "
        FinSi
    FinPara

    Escribir ""
    Escribir Sin Saltar "Menor = ", menor, " en posicion: "
    Para i <- 0 Hasta n-1 Hacer
        Si v[i] = menor Entonces
            Escribir Sin Saltar i+1, " "
        FinSi
    FinPara
    Escribir ""
FinProceso
