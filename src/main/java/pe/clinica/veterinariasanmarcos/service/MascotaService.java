package pe.clinica.veterinariasanmarcos.service;


import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.Mascota;

import java.util.List;
import java.util.Optional;

@Service
public interface MascotaService {
    public List<Mascota> listarMascota();

    public Optional<Mascota> listarMascotaPorId(Integer id);

    public void guardar(Mascota mascota);

    public void actualizar(Mascota mascota);

    public void eliminar(Integer id);

}
