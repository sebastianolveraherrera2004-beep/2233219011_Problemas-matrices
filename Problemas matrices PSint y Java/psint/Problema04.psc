Proceso Problema04
    Definir n, r, c, columnas, decimal Como Entero
    Definir bits, decimales Como Entero

    Escribir Sin Saltar "Cuantas filas tiene el arreglo: "
    Leer n

    Dimension bits[n,10]
    Dimension decimales[n]

    Para r <- 0 Hasta n-1 Hacer
        columnas <- Aleatorio(1,10)
        bits[r,0] <- columnas
        decimal <- 0

        Para c <- 1 Hasta columnas Hacer
            bits[r,c] <- Aleatorio(0,1)
            decimal <- decimal * 2 + bits[r,c]
        FinPara

        decimales[r] <- decimal
    FinPara

    Escribir "Bits generados aleatoriamente para cada fila son:"
    Para r <- 0 Hasta n-1 Hacer
        columnas <- bits[r,0]
        Para c <- 1 Hasta columnas Hacer
            Escribir Sin Saltar bits[r,c]
        FinPara
        Escribir " equivale a ", decimales[r], " decimal"
    FinPara
FinProceso
