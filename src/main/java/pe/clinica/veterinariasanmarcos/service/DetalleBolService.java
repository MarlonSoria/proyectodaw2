package pe.clinica.veterinariasanmarcos.service;

import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.DetalleBol;


import java.util.List;
import java.util.Optional;

@Service
public interface DetalleBolService {

    public List<DetalleBol> listarDetalleBol();

    public Optional<DetalleBol> listarDetallBolPorId(Integer id);

    public void guardar(DetalleBol detalleBol);

    public void actualizar( Integer id, DetalleBol detalleBol);

    public void eliminar(Integer id);
}
