package utils;

import entities.Vuelo;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Clase utilitaria para filtrar y ordenar vuelos por fecha de salida.
public class VueloUtils {

    /*Filtra una lista de vuelos según un rango de fechas.
     * @param vuelos Lista de vuelos a filtrar
     * @param fechaInicio Fecha inicial (puede ser null)
     * @param fechaFin Fecha final (puede ser null)
     * @return Lista filtrada y ordenada por fechaSalida
     */
    public static List<Vuelo> filtrarPorFecha(List<Vuelo> vuelos, LocalDate fechaInicio, LocalDate fechaFin) {
        return vuelos.stream()
                .filter(v -> (fechaInicio == null || !v.getFechaSalida().isBefore(fechaInicio)) &&
                        (fechaFin == null || !v.getFechaSalida().isAfter(fechaFin)))
                .sorted(Comparator.comparing(Vuelo::getFechaSalida))
                .collect(Collectors.toList());
    }
}
