import entities.Vuelo;
import utils.VueloUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // Constantes de fecha para filtrar (pueden ser null)
    private static final LocalDate fechaInicio = LocalDate.of(2026, 1, 15);
    private static final LocalDate fechaFin = LocalDate.of(2027, 1, 15);

    public static void main(String[] args) {

        // Crear lista de 10 vuelos de prueba
        List<Vuelo> vuelos = new ArrayList<>();
        vuelos.add(new Vuelo(1, "H001-V", "Iberia", "Madrid", "New York",
                LocalDate.of(2026,2,20), LocalDate.of(2026,2,21)));
        vuelos.add(new Vuelo(2, "H002-V", "Latam", "Barcelona", "Brasilia",
                LocalDate.of(2026,11,17), LocalDate.of(2026,11,17)));
        vuelos.add(new Vuelo(3, "H003-V", "Vueling", "Madrid", "París",
                LocalDate.of(2026,12,16), LocalDate.of(2026,12,16)));
        vuelos.add(new Vuelo(4, "H004-V", "Lufthansa", "Barcelona", "Berlín",
                LocalDate.of(2026,5,22), LocalDate.of(2026,5,22)));
        vuelos.add(new Vuelo(5, "H005-V", "KLM", "Madrid", "Amsterdam",
                LocalDate.of(2026,1,19), LocalDate.of(2026,1,19)));
        vuelos.add(new Vuelo(6, "H006-V", "Ryanair", "Barcelona", "Londres",
                LocalDate.of(2026,9,17), LocalDate.of(2026,9,17)));
        vuelos.add(new Vuelo(7, "H007-V", "Turkish", "Madrid", "Istanbul",
                LocalDate.of(2026,6,17), LocalDate.of(2026,6,18)));
        vuelos.add(new Vuelo(8, "H008-V", "Air France", "Barcelona", "Roma",
                LocalDate.of(2026,8,23), LocalDate.of(2026,8,23)));
        vuelos.add(new Vuelo(9, "H009-V", "TAP", "Madrid", "Oporto",
                LocalDate.of(2026,5,15), LocalDate.of(2026,5,15)));
        vuelos.add(new Vuelo(10, "H010-V", "KLM", "Barcelona", "Buacrest",
                LocalDate.of(2026,3,24), LocalDate.of(2026,3,24)));

        // Verificar que las fechas sean coherentes
        if (fechaInicio != null && fechaFin != null && fechaInicio.isAfter(fechaFin)) {
            System.out.println("¡¡¡¡¡Por favor, revise que la fecha de inicio no sea posterior a la fecha fin!!!!!");
            return;
        }

        // Filtrar vuelos según fechas
        List<Vuelo> vuelosFiltrados = VueloUtils.filtrarPorFecha(vuelos, fechaInicio, fechaFin);

        // Imprimir vuelos filtrados
        System.out.println("Vuelos filtrados:");
        vuelosFiltrados.forEach(System.out::println);


    }
}