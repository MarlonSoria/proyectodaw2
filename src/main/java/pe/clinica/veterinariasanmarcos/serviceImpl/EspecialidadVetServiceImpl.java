package pe.clinica.veterinariasanmarcos.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.EspecialidadVet;
import pe.clinica.veterinariasanmarcos.repository.EspecialidadVetRepository;
import pe.clinica.veterinariasanmarcos.service.EspecialidadVetService;

import java.util.List;
import java.util.Optional;

@Service
public class EspecialidadVetServiceImpl implements EspecialidadVetService {
    @Autowired
    private EspecialidadVetRepository repository;

    @Override
    public List<EspecialidadVet> listarEspecialidadVet() {
        return repository.findAll();
    }

    @Override
    public Optional<EspecialidadVet> listarEspecialidadVetPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void guardar(EspecialidadVet especialidadVet) {
        repository.save(especialidadVet);
    }

    @Override
    public void actualizar(EspecialidadVet especialidadVet) {
        EspecialidadVet object = repository.findById(especialidadVet.getId_especialidad()).get();
        if (object != null) {
            object.setNom_especialidad(especialidadVet.getNom_especialidad());
            repository.save(object);
        }
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
