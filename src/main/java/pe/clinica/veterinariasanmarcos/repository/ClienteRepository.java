package pe.clinica.veterinariasanmarcos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.clinica.veterinariasanmarcos.Entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

}
