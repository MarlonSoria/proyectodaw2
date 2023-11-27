package pe.clinica.veterinariasanmarcos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.clinica.veterinariasanmarcos.Entity.Cliente;
import pe.clinica.veterinariasanmarcos.service.ClienteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> listaClientes(){
        return clienteService.listarClientes();
    }

    @GetMapping("/clientes/{id}")
    public Optional<Cliente> listaClientePorId(@PathVariable Integer id){
        return clienteService.listarClientePorId(id);
    }

    @PostMapping("/guardar")
    public void guardarCliente(@RequestBody Cliente cliente) {
        clienteService.guardar(cliente);
    }

    @PutMapping("/actualizar/{id}")
    public void actualizarCliente(@PathVariable Integer id,@RequestBody Cliente cliente) {
        clienteService.actualizar(id, cliente);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarCliente(@PathVariable Integer id) {
        clienteService.eliminar(id);
    }



}
