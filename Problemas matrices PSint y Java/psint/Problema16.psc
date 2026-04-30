Proceso Problema16
    Definir n, w, x, i, dato, maxFrecuencia Como Entero
    Definir datos, frecuencia Como Entero

    Escribir Sin Saltar "n: "
    Leer n
    Escribir Sin Saltar "w: "
    Leer w
    Escribir Sin Saltar "x: "
    Leer x

    Dimension datos[n]
    Dimension frecuencia[x-w+1]

    Para i <- 0 Hasta x-w Hacer
        frecuencia[i] <- 0
    FinPara

    Escribir "Datos generados entre ", w, " y ", x, ":"
    Para i <- 0 Hasta n-1 Hacer
        datos[i] <- Aleatorio(w,x)
        frecuencia[datos[i]-w] <- frecuencia[datos[i]-w] + 1
        Escribir Sin Saltar datos[i], " "
    FinPara
    Escribir ""

    maxFrecuencia <- 0
    Para i <- 0 Hasta x-w Hacer
        Si frecuencia[i] > maxFrecuencia Entonces
            maxFrecuencia <- frecuencia[i]
        FinSi
    FinPara

    Escribir Sin Saltar "La moda es/son: "
    Para i <- 0 Hasta x-w Hacer
        Si frecuencia[i] = maxFrecuencia Entonces
            Escribir Sin Saltar i+w, " "
        FinSi
    FinPara
    Escribir "y se repite(n) ", maxFrecuencia, " veces"
FinProceso
