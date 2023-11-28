package pe.clinica.veterinariasanmarcos.service;

import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.HistorialClinico;

import java.util.List;
import java.util.Optional;

@Service
public interface HistorialClinicoService {

    public List<HistorialClinico> listarHistorialClinico();

    public Optional<HistorialClinico> listarHistorialClinicoPorId(Integer id);

    public void guardar(HistorialClinico historialClinico);

    public void actualizar(HistorialClinico historialClinico);

    public void eliminar(Integer id);

}
