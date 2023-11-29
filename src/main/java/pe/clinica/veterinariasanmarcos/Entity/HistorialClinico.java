package pe.clinica.veterinariasanmarcos.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_historial_clinico")
public class HistorialClinico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_historialclinico;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "result_examen")
    private String result_examen;

    @Column(name = "tratamiento")
    private String tratamiento;

    @Column(name = "observacion")
    private String observacion;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(value = TemporalType.DATE)
    @Column(name = "fecha")
    private Date fecha;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_mascota")
    private Mascota mascota;
}
