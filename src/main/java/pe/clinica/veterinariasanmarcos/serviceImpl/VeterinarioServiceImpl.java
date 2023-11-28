package pe.clinica.veterinariasanmarcos.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.Veterinario;
import pe.clinica.veterinariasanmarcos.repository.VeterinarioRepository;
import pe.clinica.veterinariasanmarcos.service.VeterinarioService;

import java.util.List;
import java.util.Optional;

@Service
public class VeterinarioServiceImpl implements VeterinarioService {
    @Autowired
    private VeterinarioRepository repository;

    @Override
    public List<Veterinario> listarVeterinario() {
        return repository.findAll();
    }

    @Override
    public Optional<Veterinario> listarVeterinarioPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void guardar(Veterinario veterinario) {
        repository.save(veterinario);
    }

    @Override
    public void actualizar(Veterinario veterinario) {
        Veterinario object = repository.findById(veterinario.getId_veterinario()).get();
        if (object != null) {
            object.setNombre(veterinario.getNombre());
            object.setApellidos(veterinario.getApellidos());
            object.setCelular(veterinario.getCelular());
            object.setFch_nacimiento(veterinario.getFch_nacimiento());
            object.setEmail(veterinario.getEmail());
            object.setDireccion(veterinario.getDireccion());
            object.setEspecialidadVet(veterinario.getEspecialidadVet());
            repository.save(object);
        }
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
