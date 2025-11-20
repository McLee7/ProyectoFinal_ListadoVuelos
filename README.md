# Proyecto Vuelos

## Descripción
Este proyecto en Java permite gestionar y filtrar una lista de vuelos según criterios de fecha.  
Permite:

- Filtrar vuelos por **fecha de salida**.
- Ordenar vuelos automáticamente por fecha.
- Visualizar la información completa de cada vuelo en la terminal.

El proyecto está diseñado para ejecutarse en **Java 8 o superior**, sin necesidad de dependencias externas.


## Estructura del proyecto

ListaVuelos
    -src
        -Main.java { Clase madre para ejecutar el programa
        -entities
            Vuelos.java 
        -utils
            VueloUtils.java { Funciones de filtrado y utilidades
        README.md { Este documento :)


---

## Configuración y ejecución

1. Clonar el repositorio:
git clone git@github.com:McLee7/ProyectoFinal_ListadoVuelos.git
Abrir en IntelliJ IDEA:

File → Open → seleccionar la carpeta del proyecto.

Compilar y ejecutar Main.java:

Run → Run 'Main'

Los vuelos de prueba se generan automáticamente y se filtran según las fechas definidas en Main.java:

java
Copiar código
private static final LocalDate fechaInicio = LocalDate.of(2025, 5, 15);
private static final LocalDate fechaFin = LocalDate.of(2025, 5, 25);
Puedes modificar estas fechas o dejarlas null para probar distintos rangos.

Tecnologías utilizadas
Java 8+

Paquetes organizados (entities y utils)

Librerías estándar (java.util, java.time, java.util.stream)

Notas de implementación
Se utilizan streams y Comparator para filtrar y ordenar los vuelos por fecha de salida.

La clase Vuelo sobrescribe toString() para mostrar la información de manera legible.

La función de filtrado gestiona null como ausencia de fecha de inicio o fin, devolviendo todos los vuelos pertinentes.

Se han usado constantes en Main.java para definir un rango de fechas inicial y final.

Devuelve un mensaje de recordatorio en caso de insertar una fecha inicio posterior a fecha fin.
