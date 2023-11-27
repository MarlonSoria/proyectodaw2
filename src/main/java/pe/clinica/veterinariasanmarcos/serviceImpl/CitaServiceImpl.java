package pe.clinica.veterinariasanmarcos.serviceImpl;

import pe.clinica.veterinariasanmarcos.Entity.Cita;
import pe.clinica.veterinariasanmarcos.repository.CitaRepository;
import pe.clinica.veterinariasanmarcos.service.CitaService;

import java.util.List;
import java.util.Optional;

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
    public void actualizar(Integer id, Cita cita) {
        citaRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Integer id) {
        citaRepo.deleteById(id);

    }
}
