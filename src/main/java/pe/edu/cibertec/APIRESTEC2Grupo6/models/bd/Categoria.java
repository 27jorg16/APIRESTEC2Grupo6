package pe.edu.cibertec.APIRESTEC2Grupo6.models.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@Table(name = "Categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCategoria")
    private Long idCategoria;

    @Column(name = "NomCategoria")
    private String nomCategoria;

    @Column(name = "DescripCategoria")
    private String descripCategoria;

    @Column(name = "FechaRegistro")
    private Date fechaRegistro;

    @ManyToOne
    @JoinColumn(name = "IdFarmaco")
    private Farmaco farmaco;
}
