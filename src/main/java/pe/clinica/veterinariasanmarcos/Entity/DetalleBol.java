package pe.clinica.veterinariasanmarcos.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_detalleboleta")
public class DetalleBol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_detallebol;

    @Column(name = "total")
    private double total;
}
