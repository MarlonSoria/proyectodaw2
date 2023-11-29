package pe.clinica.veterinariasanmarcos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.clinica.veterinariasanmarcos.Entity.Cita;
import pe.clinica.veterinariasanmarcos.service.CitaService;

@Controller
@RestController
@RequestMapping("/cita")
public class CitaController {

	@Autowired
	CitaService citaser;
	
	@GetMapping("/citas")
    public List<Cita> listaCitas(){
        return citaser.listarCita();
    }

    @GetMapping("/citas/{id}")
    public Optional<Cita> listaCitaPorId(@PathVariable Integer id){
        return citaser.listarCitaPorId(id);
    }

    @PostMapping("/guardar")
    public void guardarCliente(@RequestBody Cita cita) {
    	citaser.guardar(cita);
    }

    @PutMapping("/actualizar")
    public void actualizarCliente(@RequestBody Cita cita) {
    	citaser.actualizar(cita);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarCliente(@PathVariable Integer id) {
    	citaser.eliminar(id);
    }

}
