package pe.clinica.veterinariasanmarcos.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.Cliente;
import pe.clinica.veterinariasanmarcos.repository.ClienteRepository;
import pe.clinica.veterinariasanmarcos.service.ClienteService;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository cliRepo;


    @Override
    public List<Cliente> listarClientes() {
        return cliRepo.findAll();
    }

    @Override
    public Optional<Cliente> listarClientePorId(Integer id) {
        return cliRepo.findById(id);
    }

    @Override
    public void guardar(Cliente cliente) {
        cliRepo.save(cliente);

    }

    @Override
    public void actualizar(Integer id, Cliente cliente) {
        cliRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Integer id) {
        cliRepo.deleteById(id);
    }
}
