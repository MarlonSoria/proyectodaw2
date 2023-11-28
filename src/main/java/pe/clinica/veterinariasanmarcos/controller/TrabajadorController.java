package pe.clinica.veterinariasanmarcos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.clinica.veterinariasanmarcos.Entity.Trabajador;
import pe.clinica.veterinariasanmarcos.service.TrabajadorService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/trabajador")
public class TrabajadorController {
    @Autowired
    private TrabajadorService service;

    @GetMapping("/trabajadores")
    public List<Trabajador> listadoVeterinarios() {
        return service.listarTrabajador();
    }

    @GetMapping("/trabajadores/{id}")
    public Optional<Trabajador> obtenerVeterinario(@PathVariable Integer id) {
        return service.listarTrabajadorPorId(id);
    }

    @PostMapping("/guardar")
    public void guardarVeterinario(@RequestBody Trabajador trabajador) {
        service.guardar(trabajador);
    }

    @PutMapping("/actualizar")
    public void actualizarVeterinario(@RequestBody Trabajador trabajador) {
        service.actualizar(trabajador);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarVeterinario(@PathVariable Integer id) {
        service.eliminar(id);
    }
}
