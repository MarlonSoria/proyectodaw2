package pe.clinica.veterinariasanmarcos.serviceImpl;

import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.Boleta;
import pe.clinica.veterinariasanmarcos.repository.BoletaRepository;
import pe.clinica.veterinariasanmarcos.service.BoletaService;

import java.util.List;
import java.util.Optional;

@Service
public class BoletaServiceImpl implements BoletaService {

    private BoletaRepository bolRepo;

    @Override
    public List<Boleta> listarBoleta() {
        return bolRepo.findAll();
    }

    @Override
    public Optional<Boleta> listarBoletaPorId(Integer id) {
        return bolRepo.findById(id);
    }

    @Override
    public void guardar(Boleta boleta) {
        bolRepo.save(boleta);

    }

    @Override
    public void actualizar(Boleta boleta) {
        Boleta object = bolRepo.findById(boleta.getId_boleta()).get();
        if (object != null) {
            object.setFch_boleta(boleta.getFch_boleta());
            object.setDetalleBolList(boleta.getDetalleBolList());
            object.setMascota(boleta.getMascota());
            bolRepo.save(object);
        }
    }

    @Override
    public void eliminar(Integer id) {
        bolRepo.deleteById(id);
    }
}
