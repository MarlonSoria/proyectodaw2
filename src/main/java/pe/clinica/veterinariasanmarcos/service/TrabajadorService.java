package pe.clinica.veterinariasanmarcos.service;

import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.Trabajador;

import java.util.List;
import java.util.Optional;

@Service
public interface TrabajadorService {

    public List<Trabajador> listarTrabajador();

    public Optional<Trabajador> listarTrabajadorPorId(Integer id);

    public void guardar(Trabajador trabajador);

    public void actualizar(Trabajador trabajador);

    public void eliminar(Integer id);
}
