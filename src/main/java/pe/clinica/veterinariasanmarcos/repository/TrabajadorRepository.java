package pe.clinica.veterinariasanmarcos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.clinica.veterinariasanmarcos.Entity.Trabajador;

@Repository
public interface TrabajadorRepository extends JpaRepository<Trabajador,Integer> {
}
