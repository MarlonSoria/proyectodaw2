package pe.clinica.veterinariasanmarcos.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.Trabajador;
import pe.clinica.veterinariasanmarcos.repository.TrabajadorRepository;
import pe.clinica.veterinariasanmarcos.service.TrabajadorService;

import java.util.List;
import java.util.Optional;

@Service
public class TrabajadorServiceImpl implements TrabajadorService {
    @Autowired
    private TrabajadorRepository repository;

    @Override
    public List<Trabajador> listarTrabajador() {
        return repository.findAll();
    }

    @Override
    public Optional<Trabajador> listarTrabajadorPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void guardar(Trabajador trabajador) {
        repository.save(trabajador);
    }

    @Override
    public void actualizar(Trabajador trabajador) {
        Trabajador object = repository.findById(trabajador.getId_trabajador()).get();
        if (object != null) {
            object.setNombre(trabajador.getNombre());
            object.setApellido(trabajador.getApellido());
            object.setCorreo(trabajador.getCorreo());
            object.setCelular(trabajador.getCelular());
            object.setFch_nacimiento(trabajador.getFch_nacimiento());
            repository.save(object);
        }
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
