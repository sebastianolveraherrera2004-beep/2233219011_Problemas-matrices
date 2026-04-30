Proceso Problema13
    Definir n, i, mayor, posMayor Como Entero
    Definir datos, dif Como Entero

    Escribir Sin Saltar "n: "
    Leer n

    Dimension datos[n]
    Dimension dif[n-1]

    Escribir "Dame los ", n, " numeros:"
    Para i <- 0 Hasta n-1 Hacer
        Leer datos[i]
    FinPara

    mayor <- -1
    posMayor <- 0

    Escribir "Diferencia entre consecutivos"
    Para i <- 0 Hasta n-2 Hacer
        dif[i] <- Abs(datos[i+1] - datos[i])
        Escribir dif[i]

        Si dif[i] > mayor Entonces
            mayor <- dif[i]
            posMayor <- i
        FinSi
    FinPara

    Escribir "La diferencia mayor es ", mayor, " y esta entre el ", datos[posMayor], " y ", datos[posMayor+1]
FinProceso
