package pe.clinica.veterinariasanmarcos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.clinica.veterinariasanmarcos.Entity.Mascota;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota,Integer> {
}
