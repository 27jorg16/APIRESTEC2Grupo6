package pe.edu.cibertec.APIRESTEC2Grupo6.models.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@Entity
@NoArgsConstructor
@Table(name = "farmaco")
public class Farmaco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdFarmaco")
    private Integer idfarmaco;

    @Column(name = "NomFarmaco")
    private String nombrefarmaco;

    @Column(name = "Composicion")
    private String composicion;

    @Column(name = "FechaVencimiento")
    private Date FechaVencimiento;

}
