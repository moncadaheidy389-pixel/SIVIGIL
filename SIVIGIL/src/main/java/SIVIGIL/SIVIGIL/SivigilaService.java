package SIVIGIL.SIVIGIL;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SivigilaService {

    private final List<RegistroSivigila> registros = new ArrayList<>();

    public SivigilaService() {
        registros.add(new RegistroSivigila(1, "Dengue", "Bogotá", 40, 120, LocalDate.of(2026, 10, 5)));
        registros.add(new RegistroSivigila(2, "Dengue", "Cali", 41, 85, LocalDate.of(2026, 10, 12)));
        registros.add(new RegistroSivigila(3, "Varicela", "Medellín", 40, 60, LocalDate.of(2026, 10, 6)));
        registros.add(new RegistroSivigila(4, "Tuberculosis", "Bogotá", 42, 15, LocalDate.of(2026, 10, 19)));
        registros.add(new RegistroSivigila(5, "Varicela", "Cali", 43, 45, LocalDate.of(2026, 10, 26)));
    }

    public List<RegistroSivigila> obtenerTodos() {
        return new ArrayList<>(registros);
    }

    public List<RegistroSivigila> buscarPorEvento(String evento) {
        if (evento == null || evento.isBlank()) {
            throw new ConsultaException("El evento no puede estar vacío");
        }
        List<RegistroSivigila> resultado = new ArrayList<>();
        for (RegistroSivigila r : registros) {
            if (r.getEvento().equalsIgnoreCase(evento)) {
                resultado.add(r);
            }
        }
        return resultado;
    }

    public List<RegistroSivigila> buscarPorMunicipio(String municipio) {
        if (municipio == null || municipio.isBlank()) {
            throw new ConsultaException("El municipio no puede estar vacío");
        }
        List<RegistroSivigila> resultado = new ArrayList<>();
        for (RegistroSivigila r : registros) {
            if (r.getMunicipio().equalsIgnoreCase(municipio)) {
                resultado.add(r);
            }
        }
        return resultado;
    }
}