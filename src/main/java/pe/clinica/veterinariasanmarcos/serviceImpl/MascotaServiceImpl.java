package pe.clinica.veterinariasanmarcos.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.Mascota;
import pe.clinica.veterinariasanmarcos.repository.MascotaRepository;
import pe.clinica.veterinariasanmarcos.service.MascotaService;

import java.util.List;
import java.util.Optional;

@Service
public class MascotaServiceImpl implements MascotaService {
    @Autowired
    private MascotaRepository masRepo;

    @Override
    public List<Mascota> listarMascota() {
        return masRepo.findAll();
    }

    @Override
    public Optional<Mascota> listarMascotaPorId(Integer id) {
        return masRepo.findById(id);
    }

    @Override
    public void guardar(Mascota mascota) {
        masRepo.save(mascota);
    }

    @Override
    public void actualizar(Mascota mascota) {
        Mascota object = masRepo.findById(mascota.getId_mascota()).get();
        if (object != null) {
            object.setNombre(mascota.getNombre());
            object.setFch_Nacimiento(mascota.getFch_Nacimiento());
            object.setPeso(mascota.getPeso());
            object.setTipoMascota(mascota.getTipoMascota());
            object.setInformacion(mascota.getInformacion());
            object.setCliente(mascota.getCliente());
            masRepo.save(object);
        }
    }

    @Override
    public void eliminar(Integer id) {
        masRepo.deleteById(id);
    }
}
