package pe.clinica.veterinariasanmarcos.service;

import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.Cliente;

import java.util.List;
import java.util.Optional;

@Service
public interface ClienteService {

    public List<Cliente> listarCliente();

    public Optional<Cliente> listarClientePorId(Integer id);

    public void guardar(Cliente cliente);

    public void actualizar(Cliente cliente);

    public void eliminar(Integer id);

}
