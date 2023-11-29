package pe.clinica.veterinariasanmarcos.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.TipoMascota;
import pe.clinica.veterinariasanmarcos.repository.TipoMascotaRepository;
import pe.clinica.veterinariasanmarcos.service.TipoMascotaService;

import java.util.List;
import java.util.Optional;

@Service
public class TipoMascotaServiceImpl implements TipoMascotaService {
    @Autowired
    private TipoMascotaRepository repository;

    @Override
    public List<TipoMascota> listarTipoMascota() {
        return repository.findAll();
    }

    @Override
    public Optional<TipoMascota> listarTipoMascotaPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void guardar(TipoMascota tipoMascota) {
        repository.save(tipoMascota);
    }

    @Override
    public void actualizar(TipoMascota tipoMascota) {
        TipoMascota object = repository.findById(tipoMascota.getId_tipomascota()).get();
        if (object != null) {
            object.setNom_tipo(tipoMascota.getNom_tipo());
            repository.save(object);
        }
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
