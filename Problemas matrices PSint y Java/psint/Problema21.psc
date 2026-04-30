Proceso Problema21
    Definir n, r, c, columnas, valor Como Entero
    Definir m Como Entero

    n <- 4
    Dimension m[n, n + (n-1)*2]

    Para r <- 0 Hasta n-1 Hacer
        columnas <- n + (r * 2)
        Para c <- 0 Hasta columnas-1 Hacer
            Repetir
                valor <- Aleatorio(50,99)
            Hasta Que (r MOD 2 = 0 Y valor MOD 2 = 0) O (r MOD 2 <> 0 Y valor MOD 2 <> 0)
            m[r,c] <- valor
        FinPara
    FinPara

    Escribir "Matriz generada:"
    Para r <- 0 Hasta n-1 Hacer
        columnas <- n + (r * 2)
        Para c <- 0 Hasta columnas-1 Hacer
            Escribir Sin Saltar m[r,c], " "
        FinPara
        Escribir ""
    FinPara
FinProceso
