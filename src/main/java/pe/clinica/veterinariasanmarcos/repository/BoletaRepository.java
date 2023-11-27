package pe.clinica.veterinariasanmarcos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.clinica.veterinariasanmarcos.Entity.Boleta;

@Repository
public interface BoletaRepository extends JpaRepository<Boleta,Integer> {
}
