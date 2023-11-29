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

import pe.clinica.veterinariasanmarcos.Entity.Boleta;
import pe.clinica.veterinariasanmarcos.service.BoletaService;

@Controller
@RestController
@RequestMapping("/boleta")
public class BoletaController {

	@Autowired
	BoletaService bolser;
	
	@GetMapping("/boletas")
    public List<Boleta> listaBoletas(){
        return bolser.listarBoleta();
    }

    @GetMapping("/boletas/{id}")
    public Optional<Boleta> listaBoletaPorId(@PathVariable Integer id){
        return bolser.listarBoletaPorId(id);
    }

    @PostMapping("/guardar")
    public void guardarBoleta(@RequestBody Boleta boleta) {
        bolser.guardar(boleta);
    }

    @PutMapping("/actualizar")
    public void actualizarBoleta(@RequestBody Boleta boleta) {
        bolser.actualizar(boleta);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarBoleta(@PathVariable Integer id) {
        bolser.eliminar(id);
    }

}
