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
@Table(name="tb_cita")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cita;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(value = TemporalType.DATE)
    @Column(name = "fch_cita")
    private Date fch_Cita;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_veterinario")
    private Veterinario veterinario;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_mascota")
    private Mascota mascota;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_trabajador")
    private Trabajador trabajador;
}
