package entities;

import java.time.LocalDate;

 //Representa un vuelo con información de aerolínea, ciudades y fechas.
public class Vuelo {
    private int id;
    private String nombreVuelo;
    private String empresa;
    private String lugarSalida;
    private String lugarLlegada;
    private LocalDate fechaSalida;
    private LocalDate fechaLlegada;

    // Constructor
    public Vuelo(int id, String nombreVuelo, String empresa, String lugarSalida,
                 String lugarLlegada, LocalDate fechaSalida, LocalDate fechaLlegada) {
        this.id = id;
        this.nombreVuelo = nombreVuelo;
        this.empresa = empresa;
        this.lugarSalida = lugarSalida;
        this.lugarLlegada = lugarLlegada;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }

    // Getters
    public int getId() { return id; }
    public String getNombreVuelo() { return nombreVuelo; }
    public String getEmpresa() { return empresa; }
    public String getLugarSalida() { return lugarSalida; }
    public String getLugarLlegada() { return lugarLlegada; }
    public LocalDate getFechaSalida() { return fechaSalida; }
    public LocalDate getFechaLlegada() { return fechaLlegada; }

    @Override
    public String toString() {
        return String.format("%s (%s) | %s -> %s | Salida: %s Llegada: %s",
                nombreVuelo, empresa, lugarSalida, lugarLlegada, fechaSalida, fechaLlegada);
    }
}
