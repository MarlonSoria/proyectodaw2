package pe.clinica.veterinariasanmarcos.service;

import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.Cita;
import pe.clinica.veterinariasanmarcos.Entity.Cliente;

import java.util.List;
import java.util.Optional;

@Service
public interface CitaService {

    public List<Cita> listarCita();

    public Optional<Cita> listarCitaPorId(Integer id);

    public void guardar(Cita cita);

    public void actualizar( Integer id, Cita cita);

    public void eliminar(Integer id);
}
