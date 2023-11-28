package pe.clinica.veterinariasanmarcos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.clinica.veterinariasanmarcos.Entity.Veterinario;
import pe.clinica.veterinariasanmarcos.service.VeterinarioService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/veterinario")
public class VeterinarioController {
    @Autowired
    private VeterinarioService service;

    @GetMapping("/veterinarios")
    public List<Veterinario> listadoVeterinarios() {
        return service.listarVeterinario();
    }

    @GetMapping("/veterinarios/{id}")
    public Optional<Veterinario> obtenerVeterinario(@PathVariable Integer id) {
        return service.listarVeterinarioPorId(id);
    }

    @PostMapping("/guardar")
    public void guardarVeterinario(@RequestBody Veterinario veterinario) {
        service.guardar(veterinario);
    }

    @PutMapping("/actualizar")
    public void actualizarVeterinario(@RequestBody Veterinario veterinario) {
        service.actualizar(veterinario);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarVeterinario(@PathVariable Integer id) {
        service.eliminar(id);
    }
}
