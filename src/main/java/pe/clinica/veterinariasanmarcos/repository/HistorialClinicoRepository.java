package pe.clinica.veterinariasanmarcos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.clinica.veterinariasanmarcos.Entity.HistorialClinico;

@Repository
public interface HistorialClinicoRepository extends JpaRepository<HistorialClinico,Integer> {
}
