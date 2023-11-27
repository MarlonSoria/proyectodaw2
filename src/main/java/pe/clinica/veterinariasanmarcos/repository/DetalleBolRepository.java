package pe.clinica.veterinariasanmarcos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.clinica.veterinariasanmarcos.Entity.DetalleBol;

@Repository
public interface DetalleBolRepository extends JpaRepository<DetalleBol,Integer> {
}
