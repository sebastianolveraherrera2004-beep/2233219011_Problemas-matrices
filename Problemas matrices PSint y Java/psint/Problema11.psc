Proceso Problema11
    Definir n, i, j Como Entero
    Definir nombres, temp Como Cadena

    Escribir Sin Saltar "n: "
    Leer n
    Dimension nombres[n]

    Escribir "Dame los ", n, " nombres:"
    Para i <- 0 Hasta n-1 Hacer
        Leer nombres[i]
        nombres[i] <- Mayusculas(nombres[i])
    FinPara

    Para i <- 0 Hasta n-2 Hacer
        Para j <- 0 Hasta n-2-i Hacer
            Si nombres[j] > nombres[j+1] Entonces
                temp <- nombres[j]
                nombres[j] <- nombres[j+1]
                nombres[j+1] <- temp
            FinSi
        FinPara
    FinPara

    Escribir "Ordenados"
    Para i <- 0 Hasta n-1 Hacer
        Escribir nombres[i]
    FinPara
FinProceso
