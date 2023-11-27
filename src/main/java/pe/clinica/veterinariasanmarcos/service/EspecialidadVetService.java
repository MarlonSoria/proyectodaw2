package pe.clinica.veterinariasanmarcos.service;

import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.EspecialidadVet;

import java.util.List;
import java.util.Optional;

@Service
public interface EspecialidadVetService {

    public List<EspecialidadVet> listarEspecialidadVet();

    public Optional<EspecialidadVet> listarEspecialidadVetPorId(Integer id);

    public void guardar(EspecialidadVet especialidadVet);

    public void actualizar( Integer id, EspecialidadVet especialidadVet);

    public void eliminar(Integer id);
}
