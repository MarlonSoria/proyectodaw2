package pe.clinica.veterinariasanmarcos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.clinica.veterinariasanmarcos.Entity.EspecialidadVet;
import pe.clinica.veterinariasanmarcos.service.EspecialidadVetService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/especialidad")
public class EspecialidadVetController {
    @Autowired
    private EspecialidadVetService service;

    @GetMapping("/especialidades")
    public List<EspecialidadVet> listadoVeterinarios() {
        return service.listarEspecialidadVet();
    }

    @GetMapping("/especialidades/{id}")
    public Optional<EspecialidadVet> obtenerVeterinario(@PathVariable Integer id) {
        return service.listarEspecialidadVetPorId(id);
    }

    @PostMapping("/guardar")
    public void guardarVeterinario(@RequestBody EspecialidadVet especialidadVet) {
        service.guardar(especialidadVet);
    }

    @PutMapping("/actualizar")
    public void actualizarVeterinario(@RequestBody EspecialidadVet especialidadVet) {
        service.actualizar(especialidadVet);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarVeterinario(@PathVariable Integer id) {
        service.eliminar(id);
    }
}
