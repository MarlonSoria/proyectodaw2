package pe.clinica.veterinariasanmarcos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.clinica.veterinariasanmarcos.Entity.TipoMascota;

@Repository
public interface TipoMascotaRepository extends JpaRepository<TipoMascota,Integer> {
}
