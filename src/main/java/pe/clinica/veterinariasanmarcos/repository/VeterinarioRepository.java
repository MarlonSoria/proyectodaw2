package pe.clinica.veterinariasanmarcos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.clinica.veterinariasanmarcos.Entity.Veterinario;

@Repository
public interface VeterinarioRepository extends JpaRepository<Veterinario,Integer> {
}
