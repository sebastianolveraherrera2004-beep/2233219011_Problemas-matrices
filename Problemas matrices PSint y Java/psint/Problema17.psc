Proceso Problema17
    Definir n, x, i, j, suma, sumaGrupo, tempProm Como Entero
    Definir nombres, tempNombre Como Cadena
    Definir calif, promedios Como Entero

    Escribir Sin Saltar "No. de alumnos: "
    Leer n
    Escribir Sin Saltar "No. de materias por alumno: "
    Leer x

    Dimension nombres[n]
    Dimension calif[n,x]
    Dimension promedios[n]

    Para i <- 0 Hasta n-1 Hacer
        Escribir Sin Saltar "Nombre: "
        Leer nombres[i]
        suma <- 0

        Para j <- 0 Hasta x-1 Hacer
            Escribir Sin Saltar "Calif ", j+1, ": "
            Leer calif[i,j]
            suma <- suma + calif[i,j]
        FinPara

        promedios[i] <- Trunc(suma / x)
    FinPara

    Para i <- 0 Hasta n-2 Hacer
        Para j <- 0 Hasta n-2-i Hacer
            Si nombres[j] > nombres[j+1] Entonces
                tempNombre <- nombres[j]
                nombres[j] <- nombres[j+1]
                nombres[j+1] <- tempNombre

                tempProm <- promedios[j]
                promedios[j] <- promedios[j+1]
                promedios[j+1] <- tempProm

                Para suma <- 0 Hasta x-1 Hacer
                    tempProm <- calif[j,suma]
                    calif[j,suma] <- calif[j+1,suma]
                    calif[j+1,suma] <- tempProm
                FinPara
            FinSi
        FinPara
    FinPara

    sumaGrupo <- 0
    Escribir Sin Saltar "Nombre "
    Para j <- 0 Hasta x-1 Hacer
        Escribir Sin Saltar "Calif ", j+1, " "
    FinPara
    Escribir "Promedio"

    Para i <- 0 Hasta n-1 Hacer
        Escribir Sin Saltar nombres[i], " "
        Para j <- 0 Hasta x-1 Hacer
            Escribir Sin Saltar calif[i,j], " "
        FinPara
        Escribir promedios[i]
        sumaGrupo <- sumaGrupo + promedios[i]
    FinPara

    Escribir "Promedio del Gpo.= ", Trunc(sumaGrupo / n)
FinProceso
