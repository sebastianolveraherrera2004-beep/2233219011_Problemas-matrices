Proceso Problema15
    Definir f, col, r, c, i, suma Como Entero
    Definir m Como Entero
    Definir periferia Como Logico

    Escribir Sin Saltar "Filas: "
    Leer f
    Escribir Sin Saltar "Columnas: "
    Leer col

    Dimension m[f,col]

    Escribir "Matriz"
    Para r <- 0 Hasta f-1 Hacer
        Para c <- 0 Hasta col-1 Hacer
            m[r,c] <- Aleatorio(-9,20)
            Escribir Sin Saltar m[r,c], " "
        FinPara
        Escribir ""
    FinPara

    Escribir "Transpuesta:"
    Para c <- 0 Hasta col-1 Hacer
        Para r <- 0 Hasta f-1 Hacer
            Escribir Sin Saltar m[r,c], " "
        FinPara
        Escribir ""
    FinPara

    Si f = col Entonces
        suma <- 0
        Para i <- 0 Hasta f-1 Hacer
            Si m[i,i] MOD 2 <> 0 Entonces
                suma <- suma + m[i,i]
            FinSi
        FinPara
        Escribir "Matriz cuadrada."
        Escribir "Suma de impares de diagonal = ", suma
    SiNo
        suma <- 0
        Para r <- 0 Hasta f-1 Hacer
            Para c <- 0 Hasta col-1 Hacer
                periferia <- r = 0 O r = f-1 O c = 0 O c = col-1
                Si periferia Y m[r,c] MOD 7 = 0 Entonces
                    suma <- suma + m[r,c]
                FinSi
            FinPara
        FinPara
        Escribir "No es cuadrada."
        Escribir "Suma de multiplos de 7 de periferia = ", suma
    FinSi
FinProceso
