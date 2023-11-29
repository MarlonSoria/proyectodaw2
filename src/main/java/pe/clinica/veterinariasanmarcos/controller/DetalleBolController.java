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
import pe.clinica.veterinariasanmarcos.Entity.DetalleBol;
import pe.clinica.veterinariasanmarcos.service.DetalleBolService;

@Controller
@RestController
@RequestMapping("/detalle")
public class DetalleBolController {

	@Autowired
	DetalleBolService detaser;
	
	@GetMapping("/detalles")
    public List<DetalleBol> listaDetalleBol(){
        return detaser.listarDetalleBol();
    }

    @GetMapping("/detalles/{id}")
    public Optional<DetalleBol> listaDetalleBolPorId(@PathVariable Integer id){
        return detaser.listarDetallBolPorId(id);
    }

    @PostMapping("/guardar")
    public void guardarDetalleBol(@RequestBody DetalleBol detallebol) {
    	detaser.guardar(detallebol);
    }

    @PutMapping("/actualizar")
    public void actualizarDetalleBol(@RequestBody DetalleBol detallebol) {
    	detaser.actualizar(detallebol);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarDetalleBol(@PathVariable Integer id) {
    	detaser.eliminar(id);
    }
}
