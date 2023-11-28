package pe.clinica.veterinariasanmarcos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.clinica.veterinariasanmarcos.Entity.Mascota;
import pe.clinica.veterinariasanmarcos.service.MascotaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mascota")
public class MascotaController {
    @Autowired
    private MascotaService service;

    @GetMapping("/mascotas")
    public List<Mascota> listadoMascotas() {
        return service.listarMascota();
    }

    @GetMapping("/mascotas/{id}")
    public Optional<Mascota> listadoMascotaPorId(@PathVariable Integer id) {
        return service.listarMascotaPorId(id);
    }

    @PostMapping("/guardar")
    public void guardarMascota(@RequestBody Mascota mascota) {
        service.guardar(mascota);
    }

    @PutMapping("/actualizar")
    public void actualizarMascota(@RequestBody Mascota mascota) {
        service.actualizar(mascota);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarMascota(@PathVariable Integer id) {
        service.eliminar(id);
    }

}
