Proceso Problema19
    Definir n, w, x, i, suma Como Entero
    Definir datos Como Entero
    Definir media, sumaCuadrados, cuadrado, s Como Real

    Escribir Sin Saltar "n: "
    Leer n
    Escribir Sin Saltar "w: "
    Leer w
    Escribir Sin Saltar "x: "
    Leer x

    Dimension datos[n]

    suma <- 0
    Escribir "Datos generados entre ", w, " y ", x, ":"
    Para i <- 0 Hasta n-1 Hacer
        datos[i] <- Aleatorio(w,x)
        suma <- suma + datos[i]
        Escribir Sin Saltar datos[i], " "
    FinPara
    Escribir ""

    media <- suma / n
    sumaCuadrados <- 0

    Escribir "Obs Datos (xi-xmed)^2"
    Para i <- 0 Hasta n-1 Hacer
        cuadrado <- (datos[i] - media) ^ 2
        sumaCuadrados <- sumaCuadrados + cuadrado
        Escribir i+1, " ", datos[i], " ", cuadrado
    FinPara

    s <- Raiz(sumaCuadrados / (n - 1))

    Escribir "suma= ", suma, " ", sumaCuadrados
    Escribir "xmed= ", media
    Escribir "S= ", s
FinProceso
