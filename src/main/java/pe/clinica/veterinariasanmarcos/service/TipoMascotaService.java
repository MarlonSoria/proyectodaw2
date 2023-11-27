package pe.clinica.veterinariasanmarcos.service;

import org.springframework.stereotype.Service;

import pe.clinica.veterinariasanmarcos.Entity.TipoMascota;

import java.util.List;
import java.util.Optional;

@Service
public interface TipoMascotaService {

    public List<TipoMascota> listarTipoMascota();

    public Optional<TipoMascota> listarTipoMascotaPorId(Integer id);

    public void guardar(TipoMascota tipoMascota);

    public void actualizar( Integer id, TipoMascota tipoMascota);

    public void eliminar(Integer id);
}
