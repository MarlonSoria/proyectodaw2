package pe.clinica.veterinariasanmarcos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.clinica.veterinariasanmarcos.Entity.EspecialidadVet;

@Repository
public interface EspecialidadVetRepository extends JpaRepository<EspecialidadVet,Integer> {
}
