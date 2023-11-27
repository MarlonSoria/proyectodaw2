package pe.clinica.veterinariasanmarcos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.clinica.veterinariasanmarcos.Entity.Cita;

@Repository
public interface CitaRepository extends JpaRepository<Cita,Integer> {
}
