package SIVIGIL.SIVIGIL;

import java.time.LocalDate;

public class RegistroSivigila {

    private int id;
    private String evento;
    private String municipio;
    private int semanaEpidemiologica;
    private int casos;
    private LocalDate fecha;

    public RegistroSivigila(int id, String evento, String municipio,
                            int semanaEpidemiologica, int casos, LocalDate fecha) {
        this.id = id;
        this.evento = evento;
        this.municipio = municipio;
        this.semanaEpidemiologica = semanaEpidemiologica;
        this.casos = casos;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public String getEvento() {
        return evento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public int getSemanaEpidemiologica() {
        return semanaEpidemiologica;
    }

    public int getCasos() {
        return casos;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}