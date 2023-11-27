package pe.clinica.veterinariasanmarcos.service;

import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.Trabajador;
import pe.clinica.veterinariasanmarcos.Entity.Veterinario;

import java.util.List;
import java.util.Optional;

@Service
public interface VeterinarioService {
    public List<Veterinario> listarVeterinario();

    public Optional<Veterinario> listarVeterinarioPorId(Integer id);

    public void guardar(Veterinario veterinario);

    public void actualizar( Integer id, Veterinario veterinario);

    public void eliminar(Integer id);
}
