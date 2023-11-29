package pe.clinica.veterinariasanmarcos.serviceImpl;

import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.Cita;
import pe.clinica.veterinariasanmarcos.repository.CitaRepository;
import pe.clinica.veterinariasanmarcos.service.CitaService;

import java.util.List;
import java.util.Optional;

@Service
public class CitaServiceImpl implements CitaService {

    private CitaRepository citaRepo;

    @Override
    public List<Cita> listarCita() {
        return citaRepo.findAll();
    }

    @Override
    public Optional<Cita> listarCitaPorId(Integer id) {
        return citaRepo.findById(id);
    }

    @Override
    public void guardar(Cita cita) {
        citaRepo.save(cita);

    }

    @Override
    public void actualizar(Cita cita) {
        Cita object = citaRepo.findById(cita.getId_cita()).get();
        if (object != null) {
            object.setFch_cita(cita.getFch_cita());
            object.setVeterinario(cita.getVeterinario());
            object.setMascota(cita.getMascota());
            object.setTrabajador(cita.getTrabajador());
            citaRepo.save(object);
        }
    }

    @Override
    public void eliminar(Integer id) {
        citaRepo.deleteById(id);

    }
}
