Proceso Problema22
    Definir n, i, valor, num, col Como Entero
    Definir valores, series, longitudes Como Entero

    Escribir Sin Saltar "Para cuantos numeros deseas obtener su serie de Ulam: "
    Leer n

    Dimension valores[n]
    Dimension longitudes[n]
    Dimension series[n,1000]

    Para i <- 0 Hasta n-1 Hacer
        Repetir
            Escribir Sin Saltar "Ingresa valor (mayor que cero): "
            Leer valor
        Hasta Que valor > 0

        valores[i] <- valor
        num <- valor
        col <- 0

        Mientras num >= 1 Hacer
            series[i,col] <- num
            col <- col + 1

            Si num = 1 Entonces
                num <- 0
            SiNo
                Si num MOD 2 = 0 Entonces
                    num <- Trunc(num / 2)
                SiNo
                    num <- num * 3 + 1
                FinSi
            FinSi
        FinMientras

        longitudes[i] <- col
    FinPara

    Para i <- 0 Hasta n-1 Hacer
        Escribir "La serie Ulam de ", valores[i], " es"
        Para col <- 0 Hasta longitudes[i]-1 Hacer
            Escribir Sin Saltar series[i,col], " "
        FinPara
        Escribir ""
    FinPara
FinProceso
