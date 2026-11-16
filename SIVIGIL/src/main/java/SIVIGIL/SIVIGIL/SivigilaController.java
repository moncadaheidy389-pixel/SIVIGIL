package SIVIGIL.SIVIGIL;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/registros")
public class SivigilaController {

    private final SivigilaService servicio;

    public SivigilaController(SivigilaService servicio) {
        this.servicio = servicio;
    }

    // ===== PARTE DE CRISTIAN (no tocar, él la agrega aquí) =====


    // ===== PARTE DE GEIDY =====
    @GetMapping("/evento/{evento}")
    public List<RegistroSivigila> porEvento(@PathVariable String evento) {
        return servicio.buscarPorEvento(evento);
    }

    @GetMapping("/municipio/{municipio}")
    public List<RegistroSivigila> porMunicipio(@PathVariable String municipio) {
        return servicio.buscarPorMunicipio(municipio);
    }

    @ExceptionHandler(ConsultaException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String manejarError(ConsultaException e) {
        return e.getMessage();
    }
}