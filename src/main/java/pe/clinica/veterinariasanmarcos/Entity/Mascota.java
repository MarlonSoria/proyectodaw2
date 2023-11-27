package pe.clinica.veterinariasanmarcos.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_mascota")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_mascota;

    @Column(name = "nombre")
    private String nombre;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(value = TemporalType.DATE)
    @Column(name = "fch_nacimiento")
    private Date fch_Nacimiento;

    @Column(name = "peso")
    private Double peso;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_tipomascota")
    private TipoMascota tipoMascota;

    @Column(name = "Informacion")//AQUI SE DETALLA LA RAZA DE LA MASCOTA COMO INFORMACION ADICIONAL
    private String informacion;

    @OneToMany(targetEntity = HistorialClinico.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_mascota")
    private List<HistorialClinico> historialClinicoList;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;



}
