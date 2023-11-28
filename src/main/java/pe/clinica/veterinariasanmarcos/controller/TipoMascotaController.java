package pe.clinica.veterinariasanmarcos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.clinica.veterinariasanmarcos.Entity.TipoMascota;
import pe.clinica.veterinariasanmarcos.service.TipoMascotaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipomas")
public class TipoMascotaController {
    @Autowired
    private TipoMascotaService service;

    @GetMapping("/tipos")
    public List<TipoMascota> listadoTipos() {
        return service.listarTipoMascota();
    }

    @GetMapping("/tipos/{id}")
    public Optional<TipoMascota> listarTipoPorId(@PathVariable Integer id) {
        return service.listarTipoMascotaPorId(id);
    }

    @PostMapping("/guardar")
    public void guardarTipo(@RequestBody TipoMascota tipoMascota) {
        service.guardar(tipoMascota);
    }

    @PutMapping("/actualizar")
    public void actualizarTipo(@RequestBody TipoMascota tipoMascota) {
        service.actualizar(tipoMascota);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarTipo(@PathVariable Integer id) {
        service.eliminar(id);
    }
}
