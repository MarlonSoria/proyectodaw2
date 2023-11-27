package pe.clinica.veterinariasanmarcos.service;

import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.Boleta;


import java.util.List;
import java.util.Optional;

@Service
public interface BoletaService {

    public List<Boleta> listarBoleta();

    public Optional<Boleta> listarBoletaPorId(Integer id);

    public void guardar(Boleta boleta);

    public void actualizar( Integer id, Boleta boleta);

    public void eliminar(Integer id);

}
