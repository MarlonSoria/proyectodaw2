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
import pe.clinica.veterinariasanmarcos.Entity.HistorialClinico;
import pe.clinica.veterinariasanmarcos.service.HistorialClinicoService;

@Controller
@RestController
@RequestMapping("/historial")
public class HistorialClinicoController {

	@Autowired
	HistorialClinicoService histoser;
	
	@GetMapping("/historiales")
    public List<HistorialClinico> listaHistoriales(){
        return histoser.listarHistorialClinico();
    }

    @GetMapping("/historiales/{id}")
    public Optional<HistorialClinico> listaHistorialPorId(@PathVariable Integer id){
        return histoser.listarHistorialClinicoPorId(id);
    }

    @PostMapping("/guardar")
    public void guardarHistorial(@RequestBody HistorialClinico historial) {
    	histoser.guardar(historial);
    }

    @PutMapping("/actualizar")
    public void actualizarHistorial(@RequestBody HistorialClinico historial) {
    	histoser.actualizar(historial);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarHistorial(@PathVariable Integer id) {
        histoser.eliminar(id);
    }
}
